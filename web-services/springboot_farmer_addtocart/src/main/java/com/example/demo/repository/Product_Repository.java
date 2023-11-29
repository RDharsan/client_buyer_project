package com.example.demo.repository;


import com.example.demo.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Product_Repository extends JpaRepository<Product_model, Long> {

	Product_model findOne(Long productId);
}