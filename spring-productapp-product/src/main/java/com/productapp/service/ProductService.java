package com.productapp.service;

import java.util.List;

import com.productapp.model.Product;

public interface ProductService {

	List<Product> findAll();

	List<Product> findByCategory(String category);

	List<Product> findById(int id);

}
