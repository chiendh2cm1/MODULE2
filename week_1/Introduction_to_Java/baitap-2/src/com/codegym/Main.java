package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your Number");
        int Number = scanner.nextInt();
        String display1 = "";
        switch (Number) {
            case 0:
                display1 = "ze  ro";
                break;
            case 1:
                display1 = "one";
                break;
            case 2:
                display1 = "tow";
                break;
            case 3:
                display1 = "three";
                break;
            case 4:
                display1 = "four";
                break;
            case 5:
                display1 = "five";
                break;
            case 6:
                display1 = "six";
                break;
            case 7:
                display1 = "seven";
                break;
            case 8:
                display1 = "eight";
                break;
            case 9:
                display1 = "nine";
                break;
            case 10:
                display1 = "ten";
                break;
            case 11:
                display1 = "eleven";
                break;
            case 12:
                display1 = "twelve";
                break;
            case 13:
                display1 = "thirteen";
                break;
            case 14:
                display1 = "fourteen";
                break;
            case 15:
                display1 = "fifteen";
                break;
            case 16:
                display1 = "sixteen";
                break;
            case 17:
                display1 = "seventeen";
                break;
            case 18:
                display1 = "eighteen";
                break;
            case 19:
                display1 = "nineteen";
                break;
            case 20:
                display1 = "twenty";
                break;

        }
        System.out.print("is a: " + display1);

    }
}
