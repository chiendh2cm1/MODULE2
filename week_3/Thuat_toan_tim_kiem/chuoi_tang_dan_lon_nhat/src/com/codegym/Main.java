package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String string = sc.nextLine();

        List<Character> max = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            List<Character> list = new ArrayList<>();
            list.add(string.charAt(i));
            for (int j = i+1; j < string.length() ; j++) {
                if (string.charAt(j)>list.get(list.size()-1)){
                    list.add(string.charAt(j));
                }
            }
            if (list.size()> max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character: max)
            System.out.print(character);
    }
}
