package com.codegym;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        MyQueue<String> queue = new MyQueue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String input = sc.nextLine();
        String[] mInput = input.split("");
        for (int i = 0; i < mInput.length; i++) {
            stack.add(mInput[i]);
            queue.add(mInput[i]);
        }
        int count = 0;
        for (int i = 0; i < mInput.length / 2; i++) {
            if (!Objects.equals(stack.pop(), queue.poll())) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("Not Palindrome");
        else
            System.out.println("is Palindrome");
    }
}
