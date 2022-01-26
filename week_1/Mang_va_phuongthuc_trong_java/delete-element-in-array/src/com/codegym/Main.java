package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 12, 16};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập phần tử cần xóa: ");
        int X = sc.nextInt();
        int index_del = searchElement(array, X);
        if (index_del == -1) {
            System.out.println(" Phần tử bạn nhập không có trong mảng");
        } else {
            array = deleteElement(array, index_del);

            System.out.println(" Dãy số sau khi xóa");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }
    }

    static int searchElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    static int[] deleteElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = arr[i];
            } else {
                newArray[i] = arr[i + 1];
            }
        }
        return newArray;
    }
}