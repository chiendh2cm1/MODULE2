package com.codegym;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("chien", 27);
        hasMap.put("duc", 29);
        hasMap.put("manh", 28);
        hasMap.put("hung", 28);
        hasMap.put("cuong", 26);
        System.out.println("Display entries in hasMap: ");
        System.out.println(hasMap + "\n");
        System.out.println(hasMap.get("manh"));

        Map<String, Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println("Display entries in treeMap: ");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linnkedHashMap = new LinkedHashMap<>(hasMap);
        System.out.println("\nThe age for " + "chien is " + linnkedHashMap.get("chien"));
    }
}
