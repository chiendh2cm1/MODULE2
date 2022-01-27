package com.codegym;

public class Main {

    public static void main(String[] args) {
	LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization("lazy");
    Thread thread = new Thread(lazyPrimeFactorization);
    OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization("optimized");
    Thread thread1 = new Thread(optimizedPrimeFactorization);
    thread.start();
    thread1.start();
    }
}
