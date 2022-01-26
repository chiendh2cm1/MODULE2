package com.codegym;

import java.sql.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập độ dài mảng: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println(" Nhập các phần tử của mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" nhập phần tử thứ " + i + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println(" Mảng trước khi thêm là: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.print("\nNhập phần tử cần thêm vào mảng: ");
        int X = sc.nextInt();
        System.out.print("Vị trí cần chèn: ");
        int indexInsert = sc.nextInt();
        if (indexInsert <= -1 || indexInsert > length) {
            System.out.println("Không chèn được");
        } else {
            array = insertElement(array, X, indexInsert);
            System.out.println(" Mảng sau khi chèn:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }
        }

    }

    public static int[] insertElement(int[] arr, int x, int index) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index){
                newArray[i] = arr[i];
            }else if (i == index) {
                newArray[index] = x;
            }else {
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }
}
