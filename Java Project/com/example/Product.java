package com.example;
public class Product implements  Comparable<Product>{
    private int productId;
    private String productName;
    private float price;
    private float ratings;

    
    public Product(int productId, String productName, float price, float ratings) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.ratings = ratings;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public float getRatings() {
        return ratings;
    }
    public void setRatings(float ratings) {
        this.ratings = ratings;
    }
    @Override
    public int compareTo(Product p) {
        System.out.println("comparing "+this.productName+" and "+p.productName);
        if(this.price<p.price)
            return -1;
        else
            return 1;
    }
    
}