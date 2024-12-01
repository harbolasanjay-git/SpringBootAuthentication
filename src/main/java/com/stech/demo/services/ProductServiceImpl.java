package com.stech.demo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.stech.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getAllProducts() {
		Product product1 = new Product(101, "Dell Laptop", 85000.00);
		Product product2 = new Product(102, "Hp Laptop", 89000.00);
		List<Product> listOfProduct = new ArrayList<>();
		listOfProduct.add(product1);
		listOfProduct.add(product2);
		return listOfProduct;
	}

}
