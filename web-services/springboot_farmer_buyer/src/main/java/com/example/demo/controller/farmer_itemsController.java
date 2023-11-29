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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.farmer_items;
import com.example.demo.repository.farmer_itemRepository;


@RestController
@RequestMapping("/api/v/")
public class farmer_itemsController {

	@Autowired
	private farmer_itemRepository farmer_itemRepository;
	
	@GetMapping("/items")
	public List<farmer_items> getAllItems(){
		return  farmer_itemRepository.findAll();
	}
	

		@PostMapping("/items")
		public farmer_items createItems(@RequestBody farmer_items farmer_items) {
			return farmer_itemRepository.save(farmer_items);
		}
		
		// get item by id rest api
		@GetMapping("/items/{id}")
		public ResponseEntity<farmer_items> getItemById(@PathVariable Long id) {
			farmer_items farmer_items = farmer_itemRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("item not exist with id :" + id));
			return ResponseEntity.ok(farmer_items);
		}
		
		// update item rest api
		
		@PutMapping("/items/{id}")
		public ResponseEntity<farmer_items> updateItem(@PathVariable Long id, @RequestBody farmer_items itemDetails){
			farmer_items farmer_items = farmer_itemRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("items not exist with id :" + id));
			
			farmer_items.setItem_name(itemDetails.getItem_name());
			farmer_items.setAmount(itemDetails.getAmount());
			farmer_items.setCount(itemDetails.getCount());
			
			farmer_items updateItem = farmer_itemRepository.save(farmer_items);
			return ResponseEntity.ok(updateItem);
		}
		
		// delete employee rest api
		@DeleteMapping("/items/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteItems(@PathVariable Long id){
			farmer_items farmer_items = farmer_itemRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("item not exist with id :" + id));
			
			farmer_itemRepository.delete(farmer_items);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
}



	

	