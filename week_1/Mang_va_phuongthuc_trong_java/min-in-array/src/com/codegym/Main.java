package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("Enter element for array: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print("element 1:" + "\t");
            array[i] = sc.nextInt();
        }
        System.out.println("array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        int Min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < Min)
                Min = array[i];
        }
        System.out.println("\nmin of array is: " + Min);
    }
}
