package com.example.shoppingapp.model;

public class Product {
    private String name;
    private String description;
    private float price;
    private Integer imageUrls;
    private int rating;


    public Product() {
    }

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(Integer imageUrls) {
        this.imageUrls = imageUrls;
    }
}
