package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Hi on 01-02-2018.
 */
@Getter
@Setter
public class ProductDTO {

    private String productName_pro;
    private String productCost_pro;
    private byte[] productImage_pro;
    private String productDescription_pro;
    private String productSpecification_pro;
    private String category_pro;
    private Long barcode_pro;
	public ProductDTO(String productName_pro, String productCost_pro, byte[] productImage_pro, String productDescription_pro,
			String productSpecification_pro, String category_pro, Long barcode_pro) {
		super();
		this.productName_pro = productName_pro;
		this.productCost_pro = productCost_pro;
		this.productImage_pro = productImage_pro;
		this.productDescription_pro = productDescription_pro;
		this.productSpecification_pro = productSpecification_pro;
		this.category_pro = category_pro;
		this.barcode_pro = barcode_pro;
	}
	public String getproductName_pro() {
		return productName_pro;
	}
	public void setproductName_pro(String productName_pro) {
		this.productName_pro = productName_pro;
	}
	public String getproductCost_pro() {
		return productCost_pro;
	}
	public void setproductCost_pro(String productCost_pro) {
		this.productCost_pro = productCost_pro;
	}
	public byte[] getproductImage_pro() {
		return productImage_pro;
	}
	public void setproductImage_pro(byte[] productImage_pro) {
		this.productImage_pro = productImage_pro;
	}
	public String getproductDescription_pro() {
		return productDescription_pro;
	}
	public void setproductDescription_pro(String productDescription_pro) {
		this.productDescription_pro = productDescription_pro;
	}
	public String getproductSpecification_pro() {
		return productSpecification_pro;
	}
	public void setproductSpecification_pro(String productSpecification_pro) {
		this.productSpecification_pro = productSpecification_pro;
	}
	public String getcategory_pro() {
		return category_pro;
	}
	public void setcategory_pro(String category_pro) {
		this.category_pro = category_pro;
	}
	public Long getbarcode_pro() {
		return barcode_pro;
	}
	public void setbarcode_pro(Long barcode_pro) {
		this.barcode_pro = barcode_pro;
	}
    
    
}
