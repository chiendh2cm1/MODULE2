package com.codegym;

import java.util.ArrayList;
import java.util.Stack;

public class TestMain_1 {
    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        ArrayList<Integer> numbersFirst = new ArrayList<>();
        numbersFirst.add(1);
        numbersFirst.add(2);
        numbersFirst.add(3);
        numbersFirst.add(4);
        numbersFirst.add(5);
        System.out.println(numbersFirst);
        for (int i = 0; i < numbersFirst.size(); i++) {
            numbers.push(numbersFirst.get(i));
        }
        numbersFirst.clear();
        int SIZE = numbers.size();
        for (int i = 0; i < SIZE; i++) {
            numbersFirst.add(numbers.pop());

        }
        System.out.println(numbersFirst);
    }
}
