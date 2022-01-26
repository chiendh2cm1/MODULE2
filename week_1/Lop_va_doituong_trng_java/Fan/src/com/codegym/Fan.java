package com.codegym;
public class Fan {
    private final static int SLOW = 1;
    private final static int MEDIUM = 2;
    private final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.radius = 5;
        this.color = "blue";
    }
    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{ fan is on" +
                    ", speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Fan{ fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
