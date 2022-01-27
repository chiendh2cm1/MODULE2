package com.codegym;

public class LazyPrimeFactorization implements Runnable {
    String name;

    public LazyPrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int Number = 2; Number <= 100; Number++) {
            int i = 2;
            boolean isPrime = true;
            while (i < Number - 1) {
                if (Number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.println(this.name + ": " + Number);
            }
        }
    }
}
