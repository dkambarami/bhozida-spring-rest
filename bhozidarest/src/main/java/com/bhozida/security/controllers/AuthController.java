package com.bhozida.security.controllers;

import static org.springframework.http.ResponseEntity.ok;

import java.util.HashMap;
import java.util.Map;

import com.bhozida.security.repository.UserRepository;
import com.bhozida.model.Image;
import com.bhozida.model.Profile;
import com.bhozida.repository.ImageRepository;
import com.bhozida.repository.ProfileRepository;
import com.bhozida.security.config.CustomUserDetailsService;
import com.bhozida.security.config.JwtTokenProvider;
import com.bhozida.security.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenProvider jwtTokenProvider;

    @Autowired
    UserRepository users;

    @Autowired
    ProfileRepository profileRepository;

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    private CustomUserDetailsService userService;

    @SuppressWarnings("rawtypes")
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody AuthBody data) {
        try {
            String username = data.getEmail();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
            String token = jwtTokenProvider.createToken(username, this.users.findByEmail(username).getRoles());
            Map<Object, Object> model = new HashMap<>();
            model.put("username", username);
            model.put("token", token);
            return ok(model);
        } catch (AuthenticationException e) {
            throw new BadCredentialsException("Invalid email/password supplied");
        }
    }

    @SuppressWarnings("rawtypes")
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody User user) {
        User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null) {
            throw new BadCredentialsException("User with username: " + user.getEmail() + " already exists");
        }

        // create related profile and add it to the new user
        userService.saveUser(user);
        User newUser = userService.findUserByEmail(user.getEmail());
        System.out.println("User -----------------------------------------------------" + newUser.getId());
        Profile newProfile = new Profile(newUser.getId(),newUser);
        newProfile = profileRepository.save(newProfile);
        newUser.setProfile(newProfile);
        userService.saveUser(user);

        // attach the profile picture to the profile with same id.
        Image newImage = new Image(newProfile.getId(),newProfile);
        newImage = imageRepository.save(newImage);
        newProfile.setImage(newImage);
        profileRepository.save(newProfile);

        System.out.println("User -----------------------------------------------------" + newUser.toString());
        Map<Object, Object> model = new HashMap<>();
        model.put("message", "User registered successfully");
        return ok(model);
    }
}