package com.codegym;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y) {
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tổng của 2 số: " + a);
            System.out.println("Hiệu của 2 số: " + b);
            System.out.println("Tích của 2 số: " + c);
            System.out.println("Thương của 2 số: " + d);
        }catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = sc.nextInt();
        System.out.println("Input y: ");
        int y = sc.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }
}
