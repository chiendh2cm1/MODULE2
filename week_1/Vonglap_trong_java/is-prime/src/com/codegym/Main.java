package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Number:");
        int Number = scanner.nextInt();
        if (Number < 2) {
            System.out.println("Number is Not prime");
        }  else {
            int i = 2;
            boolean isPrime = true;
            while (i < Math.sqrt(Number)) {
                if (Number % i == 0) {
                  isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.println("Number is prime");
            }else {
                System.out.println("Number is Not prime");
            }
        }
    }
}
