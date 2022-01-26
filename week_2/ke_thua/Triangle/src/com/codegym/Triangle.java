package com.codegym;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, Boolean fiiled, double side1, double side2, double side3) {
        super(color, fiiled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double P = getPerimeter()/2;
        return Math.sqrt(P * (P - this.side1) * (P - this.side2) * (P - this.side3)); // S = Căn bậc 2 của P*(P-x)*(P-y)*(P-x)
    }

    @Override
    public String toString() {
        return super.toString()
                + " cạnh 1: " + this.side1
                + ", cạnh 2: " + this.side2
                + ", cạnh 3: " + this.side3
                + ",and Area: " + getArea()
                + ", Perimeter: " + getPerimeter();
    }
}
