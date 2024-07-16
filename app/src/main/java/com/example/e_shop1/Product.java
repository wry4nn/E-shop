package com.example.e_shop1;

import org.litepal.crud.LitePalSupport;

public class Product extends LitePalSupport{
    private String productName;
    private String description;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private String imageUrl;

    public Product() {}

    public Product(String title, String description, double price) {
        this.productName = title;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return productName;
    }

    public String getDescription() {
        return description;

    }

    public double getPrice() {
        return price;

    }

    public String getImageUrl() {
        return imageUrl;

    }

}