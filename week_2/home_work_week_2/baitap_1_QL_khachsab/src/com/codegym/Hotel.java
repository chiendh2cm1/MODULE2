package com.codegym;

public class Hotel {
    private int rentDays;
    private String type;
    private double price;
    private Person person;

    public Hotel(int rentDays, String typeo, double price, Person person) {
        this.rentDays = rentDays;
        this.type = typeo;
        this.price = price;
        this.person = person;
    }

    public Hotel() {
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return person + ", " + rentDays + ", " + type + ", " + price;
    }
}
