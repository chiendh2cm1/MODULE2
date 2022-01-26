package com.codegym;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn chuyển đổi: ");
        int number = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        //Chuyển đổi từ hệ thập phân sang hệ nhị phân.
        while (number != 0) {
            int x = number % 2;
            stack.add(x);
            number/=2;
        }
        int SIZE = stack.size();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(stack.pop());
        }
    }

}
