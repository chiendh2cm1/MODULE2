package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createRadom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí phần tử cần tìm: ");
        int index = sc.nextInt();
        try {
            System.out.println("giá trị phần tử thứ: " + index + " là: " + arr[index]);
        }catch (Exception e){
            System.out.println("Vị trí vượt quá giới hạn mảng.");
        }
    }
}
