package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter colum: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }
        System.out.println("matrix :");
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int max = 0;
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > max)
                    max = matrix[row][column];
            }
        }
        System.out.println("max of matrix: " + max);

    }
}