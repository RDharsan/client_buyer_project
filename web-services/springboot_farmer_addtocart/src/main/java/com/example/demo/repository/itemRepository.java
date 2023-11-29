package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.farmeritems;

@Repository
public interface itemRepository extends JpaRepository<farmeritems,Long> {

}

 
