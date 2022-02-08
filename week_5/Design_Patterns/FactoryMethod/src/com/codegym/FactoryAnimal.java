package com.codegym;

public class FactoryAnimal {
    public Animal getAnimal(String type) {
        if ("milu".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
