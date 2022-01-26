package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        double USD,VND;
        System.out.println(" Enter USD");
        USD = scanner.nextInt();
        VND = USD * rate;
        System.out.printf("result = %.2f VND", VND);
    }
}
