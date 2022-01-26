package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" nhập số lượng phần tử của mảng:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            array[i] = sc.nextInt();
        }
        sortArray(array);
        System.out.println("Nhập giá trị cần tìm: ");
        int X = sc.nextInt();
        int index = binarySearch(array, 0, array.length, X);
        if (index == -1)
            System.out.println("Không có trong mảng");
        else
            System.out.println("Có trong mảng");
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == value)
                return mid;
            else if (value > array[mid]) {
                left = mid + 1;
                return binarySearch(array, left, right, value);
            } else {
                right = mid - 1;
                return binarySearch(array, left, right, value);
            }
        }
        return -1;
    }

    public static void sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
