package com.codegym;

import java.util.Random;

public class ArrayExample {

    public int[] createRadom() {
        Random random = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách các phần tủ của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}
