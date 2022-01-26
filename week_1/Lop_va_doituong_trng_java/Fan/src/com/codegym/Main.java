package com.codegym;

public class Main {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.getFAST());
        fan1.setColor("yellow");
        fan1.setRadius(10);
        System.out.println(fan1);
        Fan fan2 =new Fan();
        fan2.setOn(false);
        fan2.setColor("blue");
        System.out.println(fan2);
    }
}
