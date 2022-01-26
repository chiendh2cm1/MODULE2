package com.codegym;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setdescription(String description) {
        this.description = description;
    }
    public void inputProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("input name: ");
        name = sc.nextLine();
        System.out.print("input price: ");
        price = sc.nextDouble();
        System.out.print("input description:");
        sc.nextLine();
        description = sc.nextLine();
    }

    public void display() {
        System.out.printf("\n%-5d %-20s %-20f %-20s", id, name, price, description);
    }
}
