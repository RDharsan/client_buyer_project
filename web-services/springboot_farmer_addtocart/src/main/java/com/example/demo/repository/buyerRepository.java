package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.farmerbuyer;

@Repository
public interface buyerRepository extends JpaRepository<farmerbuyer,Long>{

}
