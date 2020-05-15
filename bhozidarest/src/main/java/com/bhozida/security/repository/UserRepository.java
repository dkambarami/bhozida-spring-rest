package com.bhozida.security.repository;

import com.bhozida.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);

}