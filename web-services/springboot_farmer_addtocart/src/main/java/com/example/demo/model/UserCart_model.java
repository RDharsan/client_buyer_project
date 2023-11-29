package com.example.demo.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class UserCart_model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cartId;

    @ElementCollection
    private List<String> productId;

    private String userId;

	public UserCart_model(long cartId, List<String> productId, String userId) {
		super();
		this.cartId = cartId;
		this.productId = productId;
		this.userId = userId;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public List<String> getProductId() {
		return productId;
	}

	public void setProductId(List<String> productId) {
		this.productId = productId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


}