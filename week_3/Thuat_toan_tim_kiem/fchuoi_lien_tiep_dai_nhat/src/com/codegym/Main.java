package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Character> max = new ArrayList<>();
        List<Character> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = sc.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.get(list.size() - 1) && list.contains(string.charAt(i))){
                list.clear();
            }

            list.add(string.charAt(i));
            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character: max) {
            System.out.print(character);
        }
    }
}
