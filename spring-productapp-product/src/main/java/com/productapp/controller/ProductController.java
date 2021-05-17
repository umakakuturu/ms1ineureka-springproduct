package com.productapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.Product;
import com.productapp.service.ProductService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/ProductService")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping("/Products")
	public List<Product> findAll() {
		return productService.findAll();

	}

	@GetMapping("/productbycategory/{category}")
	public List<Product> findByCategory(@PathVariable("category") String category) {
		return productService.findByCategory(category);

	}

	@GetMapping("/productsbyid/{id}")
	public List<Product> findById(@PathVariable("id") int id) {
		return productService.findById(id);

	}

}
//id name email mob.no
