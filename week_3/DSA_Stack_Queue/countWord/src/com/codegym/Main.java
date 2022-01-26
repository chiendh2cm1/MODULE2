package com.codegym;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi: ");
        String name = sc.nextLine();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        name = name.toLowerCase();
        int value;
        for (int i = 0; i < name.length(); i++) {
            char key = name.charAt(i);
            if (!treeMap.containsKey(key)){
                treeMap.put(key, 1);
            }else {
                value = treeMap.get(key);
                treeMap.remove(key);
                treeMap.put(key,++value);
            }
        }
        System.out.println(treeMap);
    }
}

