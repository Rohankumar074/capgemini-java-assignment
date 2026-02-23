package com.capgemini.product_management.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.product_management.model.Product;

@Repository
public class ProductDAO {
	
	public List<Product> getAllProducts() {
	        List<Product> products = new ArrayList<>();
	        
	        products.add(new Product(101, "Laptop", 75000.0));
	        products.add(new Product(102, "Smartphone", 45000.0));
	        products.add(new Product(103, "Headphones", 2500.0));
	        
	        return products;
	    }

}
