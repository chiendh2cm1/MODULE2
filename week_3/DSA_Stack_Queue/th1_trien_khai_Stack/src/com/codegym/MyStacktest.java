package com.codegym;

import java.util.Stack;

public class MyStacktest {

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers.pop());
        System.out.println(numbers.peek());
    }
}
