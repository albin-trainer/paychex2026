package com.example.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.Order;

@FeignClient (name="product-service")
public interface ProductServiceProxy {
    @GetMapping("/products/{pid}")
    Order getProduct(@PathVariable ("pid")  int pid);
}
