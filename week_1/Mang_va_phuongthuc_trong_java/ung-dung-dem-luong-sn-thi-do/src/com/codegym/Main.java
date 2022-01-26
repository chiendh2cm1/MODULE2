package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println(" nhập số lượng sinh viên: ");
            size = sc.nextInt();
            if (size > 30)
                System.out.println(" số lượng sinh viên không vượt quá 30 ");
        } while (size > 30);
        int [] array = new int[size];
        int cout = 0;
        System.out.println(" nhập điểm của các sinh viên");
        for (int i = 0; i < array.length; i++) {
            System.out.print("sinh viên thứ " + (i+1) + " : ");
            array[i] = sc.nextInt();
            if (array[i] >5 ){
                cout ++;
            }
        }
        System.out.println("\n Số sinh viên đỗ là: " + cout);
    }
}
