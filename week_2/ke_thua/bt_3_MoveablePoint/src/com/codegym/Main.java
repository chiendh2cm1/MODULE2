package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(2, 4);
        System.out.println(point);
        point.setXY(3, 7);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point);
        MoveablePoint moveablePoint = new MoveablePoint(4, 5, 1, 1);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
