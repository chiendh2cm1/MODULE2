package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập a: ");
        double a = sc.nextDouble();
        System.out.print(" Nhập b: ");
        double b = sc.nextDouble();
        System.out.print(" Nhập c: ");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double denta = quadraticEquation.getDenta();
        if (denta < 0) {
            System.out.print("Phương trình vô nghiệm\n");
        } else if (denta == 0) {
            System.out.print("Phương trình có nghiệm duy nhất x = " + quadraticEquation.getNgiemDuyNhat() + "\n");
        }else {
            System.out.println(" Phương trình có 2 nghiệm là: x1 = " + quadraticEquation.getNghiem1() + "và x2 = " + quadraticEquation.getNghiem2());
        }
    }
}
