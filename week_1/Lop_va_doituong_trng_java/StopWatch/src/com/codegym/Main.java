package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        double sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("tổng: " + sum);
        stopWatch.end();
        System.out.println(" thời gian chạy của chương trình " + stopWatch.getElapsedTime());
    }
}
