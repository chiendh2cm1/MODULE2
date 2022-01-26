package com.codegym;

public class MyQueueTest {

    public static void main(String[] args) {
	MyQueue<Integer> intergers = new MyQueue<>();
    intergers.add(1);
    intergers.add(2);
    intergers.add(3);
    intergers.add(4);
        System.out.println(intergers.poll());
        System.out.println(intergers.peek());
    }
}
