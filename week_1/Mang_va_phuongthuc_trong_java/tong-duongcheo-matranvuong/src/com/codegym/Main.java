package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập kich thước ma trận vuông: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        System.out.println("nhập các phần tử của ma trận: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }
        System.out.println("matrix: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] +"\t" );
            }
            System.out.print("\n");
        }
        int tongCheo = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row == column) {
                    tongCheo += matrix[row][column];
                    break;
                }
            }
        }
        System.out.println(" Tổng đường chéo của ma trận vuông là: " + tongCheo);
    }
}
