package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.farmer_items;

@Repository
public interface farmer_itemRepository extends JpaRepository<farmer_items,Long> {

}

 
