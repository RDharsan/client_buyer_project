package com.example.demo.model;

import com.example.demo.enums.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class ProductOrder_model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long order_Id;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Product_model> p_products;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userId")
    private User_model user;

//    private long userId;

    private LocalDate oorderDate;

    @Enumerated(EnumType.STRING)
    private Status s_status;

	public ProductOrder_model(long orderId, List<Product_model> p_products, User_model user, LocalDate oorderDate, Status s_status) {
		super();
		this.order_Id = order_Id;
		this.p_products = p_products;
		this.user = user;
		this.oorderDate = oorderDate;
		this.s_status = s_status;
	}

	public long getOrderId() {
		return order_Id;
	}

	public void setOrderId(long order_Id) {
		this.order_Id = order_Id;
	}

	public List<Product_model> getPproducts() {
		return p_products;
	}

	public void setPproducts(List<Product_model> p_products) {
		this.p_products = p_products;
	}

	public User_model getUser() {
		return user;
	}

	public void setUser(User_model user) {
		this.user = user;
	}

	public LocalDate getOorderDate() {
		return oorderDate;
	}

	public void setOorderDate(LocalDate oorderDate) {
		this.oorderDate = oorderDate;
	}

	public Status getSstatus() {
		return s_status;
	}

	public void setSstatus(Status sstatus) {
		this.s_status = s_status;
	}
    
    


}