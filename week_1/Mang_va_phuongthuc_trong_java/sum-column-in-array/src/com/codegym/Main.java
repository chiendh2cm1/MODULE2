package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("matrix gồm " + row + " dòng và " + column + " cột: ");
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = sc.nextInt();
            }
        }
        System.out.println("matrix: ");
        for (row = 0; row < matrix.length; row++) {
            for (column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Cột mà bạn muốn tính tổng: ");
        int columnS = sc.nextInt();
        if (columnS < 0 || columnS > column) {
            System.out.print("không có cột bạn cần tính tổng.");
        } else {
            int sumColumn = 0;
            for (row = 0; row < matrix.length; row++) {
                sumColumn += matrix[row][columnS];
            }
            System.out.print("\nTổng của cột bạn chọn là: " + sumColumn);
        }
    }
}