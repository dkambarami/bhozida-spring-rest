package com.bhozida.repository;

import java.util.Optional;

import com.bhozida.model.Image;
import com.bhozida.model.Profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
public interface ImageRepository extends JpaRepository<Image, Long> {
    Optional<Image> findByName(String name);
    Optional<Image> findById(Long id);
    Optional<Image> findByProfile(Profile profile);
}