package com.codegym;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        Circle circle1 = new Circle(2, "red");
        System.out.println(circle1);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        Cylinder cylinder1 = new Cylinder(9,"white",3);
        System.out.println(cylinder1);
    }
}
