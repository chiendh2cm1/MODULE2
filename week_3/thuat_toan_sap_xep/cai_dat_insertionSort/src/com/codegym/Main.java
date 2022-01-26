package com.codegym;

public class Main {
    public static int[] list = {1,5,3,2,6,7};

    public static void insertionSort(int [] list){
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
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("Hiển thị mảng sau khi sắp xếp: ");
        for (int value: list){
            System.out.println(value);
        }
    }
}
