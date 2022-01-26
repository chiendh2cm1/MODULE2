package com.codegym;

import java.util.Scanner;

public class InputSideOfTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = sc.nextInt();
        System.out.println("Nhập cạnh b: ");
        int b = sc.nextInt();
        System.out.println("Nhập cạnh c: ");
        int c = sc.nextInt();
        try {
            calculate(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("Không phải 3 cạnh tam giác");
        }

    }

    public static void calculate(int a, int b, int c) throws IllegalTriangleException {
        if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {
            System.out.println("Đây là 3 cạnh của tam giác");
        } else {
            throw new IllegalTriangleException();
        }
    }
}
