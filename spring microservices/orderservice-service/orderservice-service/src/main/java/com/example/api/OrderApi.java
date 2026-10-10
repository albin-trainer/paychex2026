package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Order;
import com.example.proxy.ProductServiceProxy;

@RestController 
public class OrderApi {
    @PostMapping ("/order/{pid}/{q}")
    public Order orderProduct(@PathVariable ("pid")  int pid,@PathVariable ("q")  int q){
        String url="http://localhost:8000/products/"+pid;
        RestTemplate template= new RestTemplate();
        Order order = template.getForObject(url, Order.class);
        order.setQuantity(q);
        order.setPrice(order.getPrice()*q);
        return order;
    }
    @Autowired 
    private RestTemplate restTemplate;

      @PostMapping ("/order/loadbal/{pid}/{q}")
    public Order orderProductLoadBalancer(@PathVariable ("pid")  int pid,@PathVariable ("q")  int q){
        String url="http://product-service/products/"+pid;
        Order order = restTemplate.getForObject(url, Order.class);
        order.setQuantity(q);
        order.setPrice(order.getPrice()*q);
        return order;
    }
    @Autowired 
    private ProductServiceProxy proxy;
    @PostMapping ("/order/feign/{pid}/{q}")
    public Order orderProductFeign(@PathVariable ("pid")  int pid,@PathVariable ("q")  int q){
        Order order= proxy.getProduct(pid);
        order.setQuantity(q);
        order.setPrice(order.getPrice()*q);
        return order;
    }
}
