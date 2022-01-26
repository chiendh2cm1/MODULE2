package com.codegym;

public class Product {
    private String name;
    private double price;
    private String ID;
    private String description;

    public Product(String name, double price, String ID, String description) {
        this.name = name;
        this.price = price;
        this.ID = ID;
        this.description = description;
    }

    public Product() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return name + ", " + price + ", " + ID + ", " + description;
    }
}
