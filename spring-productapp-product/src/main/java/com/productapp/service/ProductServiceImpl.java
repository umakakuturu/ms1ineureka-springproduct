package com.productapp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.productapp.model.Product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ProductServiceImpl implements ProductService {
	Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Override
	public List<Product> findAll() {
		logger.info("print productlist" + showProductList());
		return showProductList();
	}

	@Override
	public List<Product> findByCategory(String category) {
		logger.info("print bycategory" + showProductList());
		return showProductList().stream().filter((i) -> i.getCategory().equals(category)).collect(Collectors.toList());
	}

	public List<Product> findById(int id) {

		List<Product> productbyid = showProductList().stream().filter((i) -> i.getProductId().equals(id))
				.collect(Collectors.toList());
		logger.info("productbyid" + productbyid);
		logger.info("probyid{}" + productbyid);
		return productbyid;
	}

	private List<Product> showProductList() {
		return Arrays.asList(new Product(1, "vivobook", "asus", "laptops", 200000),

				new Product(2, "redmi", "lenovo", "laptops", 500000), 
				new Product(3, "realme", "dell", "laptops", 80000),

		new Product(4,"refrigirator","sony","electronics",25000));
	}

}
