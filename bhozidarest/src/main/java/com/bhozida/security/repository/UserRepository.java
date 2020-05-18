package com.bhozida.security.repository;

import com.bhozida.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
public interface UserRepository extends JpaRepository<User,Long>{
    @RestResource(path="email")
    User findByEmail(String email);

}