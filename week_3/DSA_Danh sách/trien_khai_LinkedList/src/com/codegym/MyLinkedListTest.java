package com.codegym;

public class MyLinkedListTest {

    public static void main(String[] args) {
            MyLinkedList<Integer> numbers = new MyLinkedList<>();
            numbers.addFirst(1);
            numbers.add(1,2);
            numbers.add(2,3);
            numbers.add(3,4);
            numbers.add(4,5);
        for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
