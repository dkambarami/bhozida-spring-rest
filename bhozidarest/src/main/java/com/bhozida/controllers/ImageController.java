package com.bhozida.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

import com.bhozida.model.Image;
import com.bhozida.repository.ImageRepository;
@RestController
@CrossOrigin()
@RequestMapping(path = "check")
public class ImageController {

    @Autowired
    ImageRepository imageRepository;

    @PostMapping("/upload")
    public Image uplaodImage(@RequestParam("image") MultipartFile file) throws IOException {
        Image img = new Image(file.getOriginalFilename(), file.getContentType(), file.getBytes());
        final Image savedImage = imageRepository.save(img);
        System.out.println("Image saved");
        return savedImage;
    }

    @GetMapping(path = { "/get/{imageName}" })
    public Image getImage(@PathVariable("imageName") String imageName) throws IOException {
        final Optional<Image> retrievedImage = imageRepository.findByName(imageName);
        Image img = new Image(retrievedImage.get().getName(), retrievedImage.get().getType(),
                retrievedImage.get().getPic());
        return img;
    }

    @GetMapping(path = { "/getbyid/{id}" })
    public Image getImageById(@PathVariable("id") Long id) throws IOException {
        final Optional<Image> retrievedImage = imageRepository.findById(id);
        Image img = new Image(retrievedImage.get().getId(), retrievedImage.get().getType(),
                retrievedImage.get().getPic());
        return img;
    }
}