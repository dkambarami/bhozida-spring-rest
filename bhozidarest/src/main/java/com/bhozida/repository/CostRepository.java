package com.bhozida.repository;

import com.bhozida.model.Cost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
public interface CostRepository extends JpaRepository<Cost,Long>{
    
}