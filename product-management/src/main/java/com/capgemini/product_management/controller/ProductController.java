package com.capgemini.product_management.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.capgemini.product_management.model.Product;
import com.capgemini.product_management.service.ProductService;

@Controller
public class ProductController {
	
	private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String showProducts(Model model) {
        List<Product> productList = productService.fetchProducts();        
        model.addAttribute("products", productList);        
        return "products";
    }

}
