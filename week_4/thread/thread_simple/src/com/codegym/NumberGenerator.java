package com.codegym;

public class NumberGenerator extends Thread {
    private String name;
    static int MAX_PRIORITY = 10;
    static int MIN_PRIORITY = 1;

    public NumberGenerator(String name) {
        super();
        this.name = name;
    }

    public NumberGenerator() {
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(this.name +": " + i);
        }
    }
}
