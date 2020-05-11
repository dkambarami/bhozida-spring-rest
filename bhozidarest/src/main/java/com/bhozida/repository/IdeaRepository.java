package com.bhozida.repository;

import java.util.List;

import com.bhozida.model.Idea;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@CrossOrigin("*")
public interface IdeaRepository extends JpaRepository<Idea,Long>{    

    @RestResource(path="searchbykeyword")
    Page<Idea> findByNameContaining(@Param("name") String keyword,Pageable pageable);

    @RestResource(path="sector")
    List<Idea> findBySector(String sector);

    @RestResource(path="size")
    List<Idea> findBySize(String size);
}