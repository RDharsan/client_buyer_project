package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.farmer_buyer;

@Repository
public interface farmer_buyerRepository extends JpaRepository<farmer_buyer,Long>{

}
