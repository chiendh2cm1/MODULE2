package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle triangle;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời bạn nhập độ dài 3 cạnh tam giác: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println(" 3 độ dài bạn nhập không phải 3 cạnh của tam giác");
        } else {
            String color;
            System.out.println("Nhập màu sắc: ");
            sc.nextLine();
            color = sc.nextLine();
            System.out.println("Bạn có muốn tô màu: ");
            boolean fiiled = sc.nextBoolean();
            triangle = new Triangle(color, fiiled, a, b, c);
            System.out.println(triangle);
        }
    }
}
