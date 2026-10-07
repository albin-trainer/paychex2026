package com.example.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Order;

@RestController 
public class OrderApi {
    @PostMapping ("/order/{pid}/{q}")
    public Order orderProduct(@PathVariable ("pid")  int pid,@PathVariable ("q")  int q){
        String url="http://localhost:8000/products/"+pid;
        RestTemplate template= new RestTemplate();
        Order order = template.getForObject(url, Order.class);
        return order;
    }
}
