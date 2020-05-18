package com.bhozida.security.repository;

import com.bhozida.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRole(String role);
    
}