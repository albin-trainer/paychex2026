package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.example.model.Product;

import jakarta.annotation.PostConstruct;

@Component 
public class ProductService {
       List<Product> products = new ArrayList<>();
       @Autowired 
       private Environment environment;
      // @PostConstruct 
    public void init() {
        String port = environment.getProperty("local.server.port");
        products.add(new Product(1, "T Shirt", 1000.0f, port));
        products.add(new Product(2, "Jeans", 2000.0f, port));
        products.add(new Product(3, "Shoes", 30000.0f, port));
    }
    public Product getProductById(int productId) {
        init();
        for (Product product : products) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; 
    }
}
