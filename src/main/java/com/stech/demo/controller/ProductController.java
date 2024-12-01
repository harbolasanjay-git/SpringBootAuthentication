package com.stech.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stech.demo.model.Product;
import com.stech.demo.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Authentication world!!";
	}
	
	@GetMapping("/all")
	public List<Product> getAllProduct(){
		return productService.getAllProducts();
	}
}
