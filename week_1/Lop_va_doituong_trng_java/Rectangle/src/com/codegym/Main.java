package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.display());

    }
}
