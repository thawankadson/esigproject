package com.springbootjpa.service;

import java.util.List;

import com.springbootjpa.model.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int id);
	
	public void addProduct(Product product);

	public void deleteProduct(int id);

}
