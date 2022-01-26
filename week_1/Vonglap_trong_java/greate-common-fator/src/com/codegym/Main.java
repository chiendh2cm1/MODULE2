package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("No greatest common factor");
        } else if (a == 0 || b == 0) {
            int UCLN = a + b;
            System.out.println("reatest common factor: " + UCLN);
        } else {
            while (a != b) {
                if (a > b)
                    a -= b;
                else
                    b -= a;
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}
