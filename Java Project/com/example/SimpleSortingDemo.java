package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleSortingDemo {
public static void main(String[] args) {
    List<String> list=new ArrayList<>();
    list.add("Keerthana");
    list.add("Nayana");
    list.add("Gowthami");
    list.add("Priya");
    list.add("Pranshu");
    list.add("Saurabh");
    System.out.println(list);
    Collections.sort(list);
    System.out.println("-----After sorting-----");
    System.out.println(list);
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
    Collections.sort(products); //here by default sort by price L to H
    System.out.println("---after sorting---");
    for(Product p:products){
        System.out.println(p.getProductName());
    }
   // Collections.sort(products,new SortByRatings());
   Collections.sort(products,(Product pr1, Product pr2)-> {
        return pr1.getRatings()<pr2.getRatings()?1:-1;
    } );

    Collections.sort(products, (pr1,  pr2)-> pr1.getRatings()<pr2.getRatings()?1:-1);
    

     System.out.println("---Ratings H to L---");
    for(Product p:products){
        System.out.println(p.getProductName());
    }
}
}
class SortByRatings implements  Comparator<Product>{
    public int compare(Product p1, Product p2) {
        return p1.getRatings()<p2.getRatings()?1:-1;
    }    
}