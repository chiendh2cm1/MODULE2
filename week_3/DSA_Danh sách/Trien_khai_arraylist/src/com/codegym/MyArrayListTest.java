package com.codegym;

public class MyArrayListTest {

    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        myArrayList.remove(2);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
