package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số lượng số nguyên tố đầu tiên cần in ra");
        int n = sc.nextInt();
        System.out.printf(" %d số nguyên tố đầu tiên là: \n",n);
        int cout =0;
        int i =2;
        while (cout< n) {
            if (isPrime(i)) {
                System.out.println(i + " ");
                cout++;
            }
            i++;
        }
    }
public static boolean isPrime(int n) {
        if (n <2) {
            return false;
        }
        for (int j =2 ;j <= Math.sqrt(n);j++ ) {
            if (n%j ==0) {
                return false;
            }
        }
        return true;
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Display prime");
//        System.out.println(" Số lượng số nguyên tố cần hiển thị ");
//        int N = sc.nextInt();
//        int cout = 0;
//        int number = 3;
//        boolean isPrime = true;
//        System.out.println("20 số nguyên tố đầu tiên là: ");
//        System.out.println(2);
//        for (int i = 2; i <= N;){
//            for (int j = 2; j < Math.sqrt(number); j++) {
//               if (number%j ==0) {
//                   isPrime = false;
//                   break;
//               }
//            }
//            if (isPrime) {
//                System.out.println(number);
//                i++;
//                cout++;
//            }
//            isPrime = true;
//            number++;
//        }
//    }
}
