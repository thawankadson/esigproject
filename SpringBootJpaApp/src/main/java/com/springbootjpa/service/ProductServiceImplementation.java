package com.springbootjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjpa.model.Product;
import com.springbootjpa.repository.ProductRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class ProductServiceImplementation implements ProductService{

	@Autowired
	ProductRepository productRepository;
	@Override
	public List<Product> getAllProducts() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		return productRepository.findById(id).get();
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(int id) {
		productRepository.deleteById(id);
	}
}
