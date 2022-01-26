package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        }
        while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element: " + (i + 1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
                index += 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " , at position " + index);
    }
}
