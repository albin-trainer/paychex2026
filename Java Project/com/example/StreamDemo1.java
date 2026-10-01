package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo1 {
public static void main(String[] args) {
     Product p1=new Product(101, "Laptop", 70000, 4.5f);
    Product p2=new Product(102, "Phone", 20000, 4.1f);
    Product p3=new Product(103, "Book", 500, 4.9f);
    Product p4=new Product(104, "Watch", 5000, 4.2f);
    Product p5=new Product(105, "T Shirt", 1000, 4.8f);
    List <Product> products=new ArrayList<>();
    products.add(p1);
    products.add(p2)
    ;products.add(p3);
    products.add(p4);
    products.add(p5);

    products.stream().
    filter(p->p.getRatings()>=4.5).
    forEach(p->System.out.println(p.getProductName()));

System.out.println("*****************");
    Stream<Product> streams=  products.stream();
   // Predicate<Product> predicate=(p)->p.getPrice()<=10000;
    Stream<Product> stream2=  streams.filter(new PredicateImpl());
    Consumer<Product> consumer=(p)->System.out.println(p.getProductName()+" "+p.getPrice());
    stream2.forEach(consumer);

    //using stream  sort by price, rating
    //using stream find the costliest product, cheapest product
    //using stream find 2nd costliest product
    //using stream find top 3 rated products
    
    
}
}

class PredicateImpl implements  Predicate<Product>{
    public boolean test(Product p) {
        return p.getPrice()<=50000;
    }
}