package com.codegym.controller;

public class OrderDetails {
    private String productId;
    private String productName;
    private int quantily;
    private double price;

    public OrderDetails() {
    }

    public OrderDetails(String productId, String productName, int quantily, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantily = quantily;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
