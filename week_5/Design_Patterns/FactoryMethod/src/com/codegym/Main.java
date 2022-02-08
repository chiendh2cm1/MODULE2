package com.codegym;

public class Main {

    public static void main(String[] args) {
FactoryAnimal factoryAnimal = new FactoryAnimal();
Animal animal1 = factoryAnimal.getAnimal("milu");
        System.out.println("animal1 sound: " + animal1.makeSound());
        Animal animal2 = factoryAnimal.getAnimal("kitty");
        System.out.println("animal2 sound: " + animal2.makeSound());
    }
}
