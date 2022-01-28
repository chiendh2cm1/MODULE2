package com.codegym;

public class Main {


    public static final String[] validClazzName = new String[]{"C0318G"};
    public static final String[] invalidClazzName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        // write your code here
        ClazzNameExample clazzNameExample = new ClazzNameExample();
        for (String clazzName : validClazzName) {
            boolean isvalid = clazzNameExample.validate(clazzName);
            System.out.println("Clazzname is " + clazzName + " is valid: " + isvalid);
        }

        for (String clazzName : invalidClazzName) {
            boolean isvalid = clazzNameExample.validate(clazzName);
            System.out.println("Clazzname is " + clazzName + " is valid: " + isvalid);
        }

    }
}
