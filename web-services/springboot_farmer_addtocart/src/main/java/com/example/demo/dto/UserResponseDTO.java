package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private long userId_user;

    private String firstName_user;

    private String lastName_user;

    private String username_user;

//    private String password;

    private String email_user;

    private AddressDTO address_user;

    private String role_user;

	public UserResponseDTO(long userId_user, String firstName_user, String lastName_user, String username_user,
			String email_user, AddressDTO address_user, String role_user) {
		super();
		this.userId_user = userId_user;
		this.firstName_user = firstName_user;
		this.lastName_user = lastName_user;
		this.username_user = username_user;
		this.email_user = email_user;
		this.address_user = address_user;
		this.role_user = role_user;
	}

	public long getUserId_user() {
		return userId_user;
	}

	public void setUserId_user(long userId_user) {
		this.userId_user = userId_user;
	}

	public String getFirstName_user() {
		return firstName_user;
	}

	public void setFirstName_user(String firstName_user) {
		this.firstName_user = firstName_user;
	}

	public String getLastName_user() {
		return lastName_user;
	}

	public void setLastName_user(String lastName_user) {
		this.lastName_user = lastName_user;
	}

	public String getUsername_user() {
		return username_user;
	}

	public void setUsername_user(String username_user) {
		this.username_user = username_user;
	}

	public String getEmail_user() {
		return email_user;
	}

	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}

	public AddressDTO getAddress_user() {
		return address_user;
	}

	public void setAddress_user(AddressDTO address_user) {
		this.address_user = address_user;
	}

	public String getRole_user() {
		return role_user;
	}

	public void setRole_user(String role_user) {
		this.role_user = role_user;
	}
    
    

}