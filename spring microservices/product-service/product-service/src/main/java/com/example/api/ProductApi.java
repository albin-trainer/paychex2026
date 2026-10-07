package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductService;

@RestController 
public class ProductApi {
    @Autowired 
    ProductService service;
    @GetMapping ("/products/{productId}")
    public Product searchProduct( @PathVariable ("productId") int productId){
      return   service.getProductById(productId);
    }
}
