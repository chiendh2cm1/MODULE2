package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String abc = sc.nextLine();
        System.out.println("Enter character: ");
        char x = sc.next().charAt(0);
        int cout = 0;
        for (int i = 0; i < abc.length(); i++) {
            if (abc.charAt(i) == x) {
                cout++;
            }
        }
        System.out.print("Số lần xuất hiện của ký tự " + x + "là: " + cout);
    }
}
