package com.example.demo.model;


import com.example.demo.enums.*;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class User_model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId_;

    private String firstName_;

    private String lastName_;

    private String username_;

    private String password_;

    private String email_;

    @Embedded
    private Address_model address_;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ProductOrder_model> orders;

	public User_model() {
		super();
		this.userId_ = userId_;
		this.firstName_ = firstName_;
		this.lastName_ = lastName_;
		this.username_ = username_;
		this.password_ = password_;
		this.email_ = email_;
		this.address_ = address_;
		this.role = role;
		this.orders = orders;
	}

	public long getuserId_() {
		return userId_;
	}

	public void setuserId_(long userId_) {
		this.userId_ = userId_;
	}

	public String getfirstName_() {
		return firstName_;
	}

	public void setfirstName_(String firstName_) {
		this.firstName_ = firstName_;
	}

	public String getlastName_() {
		return lastName_;
	}

	public void setlastName_(String lastName_) {
		this.lastName_ = lastName_;
	}

	public String getusername_() {
		return username_;
	}

	public void setusername_(String username_) {
		this.username_ = username_;
	}

	public String getpassword_() {
		return password_;
	}

	public void setpassword_(String password_) {
		this.password_ = password_;
	}

	public String getemail_() {
		return email_;
	}

	public void setemail_(String email_) {
		this.email_ = email_;
	}

	public Address_model getAddress() {
		return address_;
	}

	public void setAddress(Address_model address_) {
		this.address_ = address_;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<ProductOrder_model> getOrders() {
		return orders;
	}

	public void setOrders(List<ProductOrder_model> orders) {
		this.orders = orders;
	}


}