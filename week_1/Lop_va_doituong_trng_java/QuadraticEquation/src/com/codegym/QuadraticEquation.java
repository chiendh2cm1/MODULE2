package com.codegym;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDenta() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getNghiem1() {
        if (getDenta() >= 0) {
            return (-this.b + Math.pow(getDenta(), 0.5)) / (2 * this.a);
        } else {
            return 0;
        }
    }

    public double getNghiem2() {
        if (getDenta() >= 0) {
            return (-this.b - Math.pow(getDenta(), 0.5)) / (2 * this.a);
        } else {
            return 0;
        }
    }

    public double getNgiemDuyNhat() {
        return -(this.b / (this.a * 2));
    }
}
