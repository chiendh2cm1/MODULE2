package com.codegym;


import java.util.Scanner;
import java.util.Stack;

public class TestMain_2 {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập input: ");
        String input = sc.nextLine();
        String [] mWord = input.split("");
        for (String s : mWord) {
            wStack.push(s);
        }
        String [] onutp = new String[mWord.length];
        int SIZE = wStack.size();
        for (int i = 0; i < SIZE; i++) {
            onutp[i] = wStack.pop();
        }
        for (int i = 0; i < onutp.length; i++) {
            System.out.print(onutp[i]);
        }
    }
}
