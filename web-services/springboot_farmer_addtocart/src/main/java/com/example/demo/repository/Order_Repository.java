package com.example.demo.repository;


import com.example.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Order_Repository extends JpaRepository<ProductOrder_model,Long> {
}