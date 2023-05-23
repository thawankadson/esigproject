package com.springbootjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="products")

public class Product {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Column(name = "product_name")
	private String productName;
	@Column(name="product_price")
	private double price;
	public int getProductId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getGetProductId() {
		return getProductId;
	}
	public void setGetProductId(int getProductId) {
		this.getProductId = getProductId;
	}

}
