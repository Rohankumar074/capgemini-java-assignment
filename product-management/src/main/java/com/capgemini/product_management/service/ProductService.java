package com.capgemini.product_management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.product_management.dao.ProductDAO;
import com.capgemini.product_management.model.Product;

@Service
public class ProductService {
	
	private final ProductDAO productDAO;

    public ProductService(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> fetchProducts() {
        return productDAO.getAllProducts();
    }

}
