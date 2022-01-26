package com.codegym;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius =1.0;
        this.color = "red";

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.pow(this.radius,2)* Math.PI;
    }
}
// thay đổi access Modifier cho  getArea:
//xuất hiện lỗi: java: getArea() has private access in com.codegym.Circle
