package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println(" Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size do not exceed 20");
            }
        }
        while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter elemen " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("\n%-20s%s", "Elements in array: ", "");
        for (int j : array) {
            System.out.print(j + "\t");
        }
        for (int j = 0; j < array.length/2; j++) {
            int tem = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = tem;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j : array) {
            System.out.print(j + "\t");
        }
    }
}
