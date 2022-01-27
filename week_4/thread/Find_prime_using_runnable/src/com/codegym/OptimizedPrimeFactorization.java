package com.codegym;

public class OptimizedPrimeFactorization implements Runnable {
    String name;

    public OptimizedPrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run() {
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
                System.out.println(this.name + ": " + Number);
            }
        }
    }
}
