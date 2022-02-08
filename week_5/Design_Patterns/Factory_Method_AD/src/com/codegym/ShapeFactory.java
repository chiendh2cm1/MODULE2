package com.codegym;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("CN".equals(type)) {
            return new Rectangle();
        } else if("Tr".equals(type)) {
            return new Circle();
        }else {
            return new Square();
        }
    }
}
