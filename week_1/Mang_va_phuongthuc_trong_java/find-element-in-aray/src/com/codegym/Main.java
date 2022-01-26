package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"A", "B", "C", "D", "E", "F"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String input_name = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list  " + input_name + " is " + i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
