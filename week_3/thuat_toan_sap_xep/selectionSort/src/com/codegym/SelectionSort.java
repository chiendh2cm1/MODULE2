package com.codegym;

public class SelectionSort {

    static double[] list = {1, 9, 4.5, 6.6, 5.7, 2};

    public static void selectionSort(double[] list) {
        int N = list.length;
        for (int i = 0; i < N; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (list[minIndex] > list[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
            System.out.println("Dãy số sau lần sắp xếp thứ: " + (i +1));
            for (double value: list)
                System.out.print(value +"     ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("dãy ban đầu");
        for (double valuex: list) {
            System.out.print(valuex + "   ");
        }
        System.out.println();
        selectionSort(list);
        for (double value: list){
            System.out.print(value + "   ");
        }
    }
}
