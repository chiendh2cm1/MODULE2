package com.codegym;

public class Circle extends Shape {
    private double radius =1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean fiiled, double radius) {
        super(color, fiiled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
    public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return  " A Circle with radius " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
