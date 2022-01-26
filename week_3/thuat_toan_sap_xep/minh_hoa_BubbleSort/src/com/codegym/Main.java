package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng số nguyên: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Nhập giá trị thứ: " + (i + 1));
            list[i] = sc.nextInt();
        }
        System.out.println("List của bạn: ");
        for (int value : list) {
            System.out.print(value + "\t");
        }
        System.out.println("List của bạn sau khi sắp xếp: ");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        int N = list.length;
        for (int i = 1; i < N; i++) {
            boolean isSorted = true;
            for (int j = 0; j < N - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    {
                        isSorted = false;
                        int temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;
                    }
                }
            }
            if (isSorted){
                System.out.println("Không có sự đổi chỗ");
                break;
            }
            System.out.println("List sau lần đổi chỗ thứ: " + i);
            for (int value: list){
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
