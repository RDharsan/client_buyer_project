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

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.farmer_buyer;
import com.example.demo.model.farmer_items;
import com.example.demo.repository.farmer_buyerRepository;
import com.example.demo.repository.farmer_itemRepository;

@RestController
@RequestMapping("buyer")
public class buyer {

	@Autowired
	private farmer_itemRepository farmer_itemRepository;
	private farmer_buyerRepository farmer_buyerRepository;
	
	@GetMapping("/items")
	public List<farmer_items> getAllItems(){
		return  farmer_itemRepository.findAll();
	}
	
	@PostMapping("/details")
	public farmer_buyer createbuyer(@RequestBody farmer_buyer farmer_buyer) {
		return farmer_buyerRepository.save(farmer_buyer);
	}
	
	// get item by id rest api
	@GetMapping("/details/{id}")
	public ResponseEntity<farmer_buyer> getBuyerById(@PathVariable Long id) {
		farmer_buyer farmer_buyer = farmer_buyerRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("buyer not exist with id :" + id));
		return ResponseEntity.ok(farmer_buyer);
	}
	
	// delete employee rest api
			@DeleteMapping("/details/{id}")
			public ResponseEntity<Map<String, Boolean>> deleteBuyer(@PathVariable Long id){
				farmer_buyer farmer_buyer = farmer_buyerRepository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundException("buyer not exist with id :" + id));
				
				farmer_buyerRepository.delete(farmer_buyer);
				Map<String, Boolean> response = new HashMap<>();
				response.put("deleted", Boolean.TRUE);
				return ResponseEntity.ok(response);
			}
}
