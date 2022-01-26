package com.codegym;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        System.out.println("Nhập file nguồn: ");
        Scanner sc = new Scanner(System.in);
        String pathSource = sc.nextLine();
        System.out.println("Nhập file đến: ");
        String pathResult = sc.nextLine();
        List<String> strings = copyFileText.readFileText(pathSource);
        copyFileText.copyFile(pathResult, strings);
    }

}
