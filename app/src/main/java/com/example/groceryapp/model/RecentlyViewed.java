package com.example.groceryapp.model;

public class RecentlyViewed {
    String name;
    String description;
    String price;
    String quantity;
    String unit;
    Integer imageUrl;
    Integer bigImageUrl;

    public RecentlyViewed(String name, String description, String price, String quantity, String unit, Integer imageUrl, Integer bigImageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
        this.imageUrl = imageUrl;
        this.bigImageUrl = bigImageUrl;
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


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getBigImageUrl() {
        return bigImageUrl;
    }

    public void setBigImageUrl(Integer bigimageurl) {
        this.bigImageUrl = bigimageurl;
    }
}