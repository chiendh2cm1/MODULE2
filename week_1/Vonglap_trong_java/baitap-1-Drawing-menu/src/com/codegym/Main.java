package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Diplay rectange");
        System.out.println("2. Display square triangle");
        System.out.println("3. Display isosceles");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter width: ");
                int width = sc.nextInt();
                System.out.println("Enter length: ");
                int length = sc.nextInt();
                for (int i = 1; i <= width; i++) {
                    for (int j = 1; j <= length; j++) {
                        System.out.print("*" + " ");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.println("Enter width: ");
                int width1 = sc.nextInt();
                for (int i = 1; i <= width1; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Enter width: ");
                int width3 = sc.nextInt();
                for (int i = width3 ; i >=1; i-- ) {
                    for (int j =i; j >=1; j--) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
            }
                break;
            case 0:
                System.out.println("0");
                break;
            default:
                System.out.println("No choice");
                break;
        }
    }
}
