package com.example.demo.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

    private double price_o;
    private String currency_o;
    private String method_o;
    private String intent_o;
    private String description_o;
	public Order(double price_o, String currency_o, String method_o, String intent_o, String description_o) {
		super();
		this.price_o = price_o;
		this.currency_o = currency_o;
		this.method_o = method_o;
		this.intent_o = intent_o;
		this.description_o = description_o;
	}
	public double getprice_o() {
		return price_o;
	}
	public void setprice_o(double price_o) {
		this.price_o = price_o;
	}
	public String getcurrency_o() {
		return currency_o;
	}
	public void setcurrency_o(String currency_o) {
		this.currency_o = currency_o;
	}
	public String getmethod_o() {
		return method_o;
	}
	public void setmethod_o(String method_o) {
		this.method_o = method_o;
	}
	public String getintent_o() {
		return intent_o;
	}
	public void setintent_o(String intent_o) {
		this.intent_o = intent_o;
	}
	public String getdescription_o() {
		return description_o;
	}
	public void setdescription_o(String description_o) {
		this.description_o = description_o;
	}

}