package com.codegym;

public class Main {
    public static void main(String[] args) {
    NumberGenerator a = new NumberGenerator("Generator1");
    NumberGenerator b = new NumberGenerator("Generator2");
    a.setPriority(NumberGenerator.MAX_PRIORITY);
    b.setPriority(NumberGenerator.MIN_PRIORITY);
    a.start();
    b.start();
    }
}
