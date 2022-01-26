package com.codegym;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public double getArea() {
        return Math.pow(super.getRadius(), 2) * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cylinder has height: " + this.height + " and Area: " + getArea();
    }
}
