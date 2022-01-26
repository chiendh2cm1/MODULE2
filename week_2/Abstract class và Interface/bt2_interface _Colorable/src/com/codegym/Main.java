package com.codegym;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        for (Shape abc : shapes) {
            if (abc instanceof Circle) {
                ((Circle) abc).howToColor();
            }
        }
    }
}
