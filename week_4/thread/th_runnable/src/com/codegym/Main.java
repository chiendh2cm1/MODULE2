package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Main thread running... ");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo1.start();
        runnableDemo2.start();
        System.out.println("Main thread stopped!!! ");
    }
}
