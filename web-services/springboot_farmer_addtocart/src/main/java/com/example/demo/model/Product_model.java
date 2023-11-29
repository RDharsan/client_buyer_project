package com.example.demo.model;


import com.example.demo.enums.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Product_model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    private String productName_p;
    private String productCost_p;
    private byte[] productImage_p;
    private String productDescription_p;
    private String productSpecification_p;

    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(unique = true)
    private Long barcode;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<ProductOrder_model> orders;

	public Product_model(long productId, String productName_p, String productCost_p, byte[] productImage_p,
			String productDescription_p, String productSpecification_p, Category category, Long barcode,
			List<ProductOrder_model> orders) {
		super();
		this.productId = productId;
		this.productName_p = productName_p;
		this.productCost_p = productCost_p;
		this.productImage_p = productImage_p;
		this.productDescription_p = productDescription_p;
		this.productSpecification_p = productSpecification_p;
		this.category = category;
		this.barcode = barcode;
		this.orders = orders;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getproductName_p() {
		return productName_p;
	}

	public void setproductName_p(String productName_p) {
		this.productName_p = productName_p;
	}

	public String getproductCost_p() {
		return productCost_p;
	}

	public void setproductCost_p(String productCost_p) {
		this.productCost_p = productCost_p;
	}

	public byte[] getproductImage_p() {
		return productImage_p;
	}

	public void setproductImage_p(byte[] productImage_p) {
		this.productImage_p = productImage_p;
	}

	public String getproductDescription_p() {
		return productDescription_p;
	}

	public void setproductDescription_p(String productDescription_p) {
		this.productDescription_p = productDescription_p;
	}

	public String getproductSpecification_p() {
		return productSpecification_p;
	}

	public void setproductSpecification_p(String productSpecification_p) {
		this.productSpecification_p = productSpecification_p;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getBarcode() {
		return barcode;
	}

	public void setBarcode(Long barcode) {
		this.barcode = barcode;
	}

	public List<ProductOrder_model> getOrders() {
		return orders;
	}

	public void setOrders(List<ProductOrder_model> orders) {
		this.orders = orders;
	}
    
    
}
