package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float widht;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter width: ");
        widht = input.nextFloat();
        System.out.println(" Enter height: ");
        height = input.nextFloat();
        float area = widht * height;
        System.out.println("Area is: " + area);
    }
}
