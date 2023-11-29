package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Address_model {

    private String postboxNo_address;

    private String landmark_address;

    private String zipcode_address;

    private String phoneNumber_address;

    private String city_address;

	public Address_model() {
		super();
		this.postboxNo_address = postboxNo_address;
		this.landmark_address = landmark_address;
		this.zipcode_address = zipcode_address;
		this.phoneNumber_address = phoneNumber_address;
		this.city_address = city_address;
	}

	public String getpostboxNo_address() {
		return postboxNo_address;
	}

	public void setpostboxNo_address(String postboxNo_address) {
		this.postboxNo_address = postboxNo_address;
	}

	public String getlandmark_address() {
		return landmark_address;
	}

	public void setlandmark_address(String landmark_address) {
		this.landmark_address = landmark_address;
	}

	public String getzipcode_address() {
		return zipcode_address;
	}

	public void setzipcode_address(String zipcode_address) {
		this.zipcode_address = zipcode_address;
	}

	public String getphoneNumber_address() {
		return phoneNumber_address;
	}

	public void setphoneNumber_address(String phoneNumber_address) {
		this.phoneNumber_address = phoneNumber_address;
	}

	public String getcity_address() {
		return city_address;
	}

	public void setcity_address(String city_address) {
		this.city_address = city_address;
	}
    
    
}