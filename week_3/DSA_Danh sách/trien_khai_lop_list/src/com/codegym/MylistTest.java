package com.codegym;

public class MylistTest {

    public static void main(String[] args) {
        Mylist<Integer> ListInteger = new Mylist<Integer>();
        ListInteger.add(1);
        ListInteger.add(2);
        ListInteger.add(3);
        ListInteger.add(3);
        ListInteger.add(4);

        System.out.println("element 4: " + ListInteger.get(4));
        System.out.println("element 3: " + ListInteger.get(3));
        System.out.println("element 2: " + ListInteger.get(2));
        System.out.println("element 1: " + ListInteger.get(1));

//        ListInteger.get(-1);
//        System.out.println("element -1: " + ListInteger.get(-1)); ( Lỗi do index = -1, size 5 )
    }
}
