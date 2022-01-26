package com.codegym;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "ò ó o";
    }

    @Override
    public String howToEat() {
        return " gà ăn thóc";
    }
}
