package com.bhozida.repository;

import com.bhozida.model.Idea;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface IdeaRepository extends JpaRepository<Idea,Long>{    
}