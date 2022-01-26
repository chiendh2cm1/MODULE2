package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Nhập độ dài mảng 1: ");
        int length1 = sc.nextInt();
        int[] array1 = new int[length1];
        System.out.println("Nhập các phần tử cho mảng 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }
        System.out.print("mảng 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.print("\nNhập độ dài mảng 2: ");
        int length2 = sc.nextInt();
        int[] array2 = new int[length2];
        System.out.println("Nhập các phần tử cho mảng 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("nhập phần tử thứ " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }
        System.out.print("mảng 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[length1] = array2[i];
            length1++;
        }
        System.out.print("\nmảng sau khi gộp mảng 1 và mảng 2 là : ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }

}
