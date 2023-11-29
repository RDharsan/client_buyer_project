package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buyer")
public class farmerbuyer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="buyername")
	private String buyername;
	
	public farmerbuyer() {
		
	}

	public farmerbuyer(long id, String buyername) {
		super();
		this.id = id;
		this.buyername = buyername;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBuyername() {
		return buyername;
	}

	public void setBuyer_name(String buyername) {
		this.buyername = buyername;
	}
	
	
}
