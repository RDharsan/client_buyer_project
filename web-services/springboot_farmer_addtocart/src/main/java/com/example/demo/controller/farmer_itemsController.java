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

import com.example.demo.exception.ResourceNotFound_Exception;
import com.example.demo.model.farmeritems;
import com.example.demo.repository.itemRepository;


@RestController
@RequestMapping("/api/v/")
public class farmer_itemsController {

	@Autowired
	private itemRepository itemRepository;
	
	@GetMapping("/items")
	public List<farmeritems> getAllItems(){
		return  itemRepository.findAll();
	}
	

		@PostMapping("/items")
		public farmeritems createItems(@RequestBody farmeritems farmer_items) {
			return itemRepository.save(farmer_items);
		}
		
		// get item by id rest api
		@GetMapping("/items/{id}")
		public ResponseEntity<farmeritems> getItemById(@PathVariable Long id) {
			farmeritems farmer_items = itemRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFound_Exception("item not exist with id :" + id));
			return ResponseEntity.ok(farmer_items);
		}
		
		// update item rest api
		
		@PutMapping("/items/{id}")
		public ResponseEntity<farmeritems> updateItem(@PathVariable Long id, @RequestBody farmeritems itemDetails){
			farmeritems farmer_items = itemRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFound_Exception("items not exist with id :" + id));
			
			farmer_items.setItem_name(itemDetails.getItem_name());
			farmer_items.setAmount(itemDetails.getAmount());
			farmer_items.setCount(itemDetails.getCount());
			
			farmeritems updateItem = itemRepository.save(farmer_items);
			return ResponseEntity.ok(updateItem);
		}
		
		// delete employee rest api
		@DeleteMapping("/items/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteItems(@PathVariable Long id){
			farmeritems farmer_items = itemRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFound_Exception("item not exist with id :" + id));
			
			itemRepository.delete(farmer_items);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
}



	

	