package com.codegym;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Các số nguyên tố từ 2 đến 100 là: ");
        for (int Number = 2; Number <= 100; Number++) {
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
                System.out.println(Number);
            }
        }
    }
}
