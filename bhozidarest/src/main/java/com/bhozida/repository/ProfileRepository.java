package com.bhozida.repository;

import com.bhozida.model.Profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
public interface ProfileRepository extends JpaRepository<Profile,Long>{

    
}