package com.example.demo.dto;


import lombok.*;
@Data
public class UserDTO {

    private String user_firstName;

    private String user_lastName;

    private String user_username;

    private String user_password;

    private String user_email;

    private AddressDTO user_addresses;

    private String user_role;

    public  UserDTO(){}

	public UserDTO(String user_firstName, String user_lastName, String user_username, String user_password, String user_email,
			AddressDTO user_addresses, String user_role) {
		super();
		this.user_firstName = user_firstName;
		this.user_lastName = user_lastName;
		this.user_username = user_username;
		this.user_password = user_password;
		this.user_email = user_email;
		this.user_addresses = user_addresses;
		this.user_role = user_role;
	}

	public String getuser_firstName() {
		return user_firstName;
	}

	public void setuser_firstName(String user_firstName) {
		this.user_firstName = user_firstName;
	}

	public String getuser_lastName() {
		return user_lastName;
	}

	public void setuser_lastName(String user_lastName) {
		this.user_lastName = user_lastName;
	}

	public String getuser_username() {
		return user_username;
	}

	public void setuser_username(String user_username) {
		this.user_username = user_username;
	}

	public String getuser_password() {
		return user_password;
	}

	public void setuser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getuser_email() {
		return user_email;
	}

	public void setuser_email(String user_email) {
		this.user_email = user_email;
	}

	public AddressDTO getuser_addresses() {
		return user_addresses;
	}

	public void setuser_addresses(AddressDTO user_addresses) {
		this.user_addresses = user_addresses;
	}

	public String getuser_role() {
		return user_role;
	}

	public void setuser_role(String user_role) {
		this.user_role = user_role;
	}
    
}
