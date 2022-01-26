package com.codegym;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] list) {
        int index;
        int X;
        for (int i = 1; i < list.length; i++) {
            X = list[i];
            index = i;
            while (index > 0 && X < list[index - 1]) {
                list[index] = list[index - 1];
                index--;
            }
            list[index] = X;
            System.out.println("\nList sau khi đổi chỗ lần : " +(i-1));
            for (int value : list)
                System.out.print(value + "\t");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int N = sc.nextInt();
        int[] list = new int[N];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            list[i] = sc.nextInt();
        }

        System.out.println("Mảng hiện tại của bạn: ");
        for (int i : list)
            System.out.print(i + "\t");
        System.out.println("List sau khi sắp xếp: ");
        insertionSort(list);
    }
}
