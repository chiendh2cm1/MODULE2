package com.codegym;

public class Shape {
    private String color = "green";
    private Boolean fiiled = true;

    public Shape() {
    }

    public Shape(String color, Boolean fiiled) {
        this.color = color;
        this.fiiled = fiiled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFiiled() {
        return fiiled;
    }

    public void setFiiled(Boolean fiiled) {
        this.fiiled = fiiled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + getColor() + " and " + (getFiiled()? "filled" : "not filled");
    }
}
