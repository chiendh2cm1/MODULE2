package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Poin2D poin2D = new Poin2D(2,3);
        System.out.println(poin2D);
        poin2D.setXY(4,5);
        System.out.println(poin2D);
        System.out.println(Arrays.toString(poin2D.getXY()));
        Poin3D poin3D = new Poin3D(2,3,4);
        System.out.println(poin3D);
        poin3D.setXYZ(2,4,5);
        System.out.println(poin3D);
        System.out.println(Arrays.toString(poin3D.getXYZ()));
    }
}
