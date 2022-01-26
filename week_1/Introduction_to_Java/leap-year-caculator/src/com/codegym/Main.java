package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap year", year);
//                } else {
//                    System.out.printf("%d is a not leap year", year);
//                }
//                }else{
//                    System.out.printf("%d is a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a not leap year",year);
//            }


        boolean isleapyear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isleapyear = true;
                }
            } else {
                isleapyear = true;
            }
        }
if (isleapyear) {
    System.out.printf("%d is a leap year", year);
}else {
    System.out.printf("%d is NOT a leap year", year);
}
    }
}
