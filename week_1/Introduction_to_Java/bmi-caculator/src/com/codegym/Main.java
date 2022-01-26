package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight");
        double weight = scanner.nextDouble();
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        double bmi = weight/(height*height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi <25) {
            System.out.println("Nomal");
        } else if (bmi <30) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
