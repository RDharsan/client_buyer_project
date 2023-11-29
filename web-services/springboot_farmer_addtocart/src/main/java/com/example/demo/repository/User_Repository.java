package com.example.demo.repository;

import com.example.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface User_Repository extends JpaRepository<User_model, Long> {

    User_model findByUsernameAndPassword(String username, String password);
    User_model findByUsername(String username);

}