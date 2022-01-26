package com.codegym;

public class BubbleSort {


    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        int N = list.length;
        for (int i = 0; i < N; i++) {
            boolean isSorted = true;
            for (int j = 0; j < N - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    isSorted = false;
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        bubbleSort(list);
        for (int value : list) {
            System.out.println(value);
        }
    }
}
