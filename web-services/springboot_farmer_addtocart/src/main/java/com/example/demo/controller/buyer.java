package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFound_Exception;
import com.example.demo.model.farmerbuyer;
import com.example.demo.model.farmeritems;
import com.example.demo.repository.buyerRepository;
import com.example.demo.repository.itemRepository;

@RestController
@RequestMapping("buyer_")
public class buyer {

	@Autowired
	private itemRepository itemRepository;
	private buyerRepository buyerRepository;
	
	@GetMapping("/items")
	public List<farmeritems> getAllItems(){
		return  itemRepository.findAll();
	}
	
	@PostMapping("/details")
	public farmerbuyer createbuyer(@RequestBody farmerbuyer farmer_buyer) {
		return buyerRepository.save(farmer_buyer);
	}
	
	// get item by id rest api
	@GetMapping("/details/{id}")
	public ResponseEntity<farmerbuyer> getBuyerById(@PathVariable Long id) {
		farmerbuyer farmer_buyer = buyerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFound_Exception("buyer not exist with id :" + id));
		return ResponseEntity.ok(farmer_buyer);
	}
	
	// delete employee rest api
			@DeleteMapping("/details/{id}")
			public ResponseEntity<Map<String, Boolean>> deleteBuyer(@PathVariable Long id){
				farmerbuyer farmer_buyer = buyerRepository.findById(id)
						.orElseThrow(() -> new ResourceNotFound_Exception("buyer not exist with id :" + id));
				
				buyerRepository.delete(farmer_buyer);
				Map<String, Boolean> response = new HashMap<>();
				response.put("deleted", Boolean.TRUE);
				return ResponseEntity.ok(response);
			}
}
