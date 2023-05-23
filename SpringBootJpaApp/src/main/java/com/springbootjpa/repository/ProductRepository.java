package com.springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootjpa.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
