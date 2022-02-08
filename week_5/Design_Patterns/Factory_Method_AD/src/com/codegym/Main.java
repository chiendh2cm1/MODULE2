package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1  = shapeFactory.getShape("CN");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape(("Tr"));
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("hinh vuong");
        shape3.draw();
    }
}
