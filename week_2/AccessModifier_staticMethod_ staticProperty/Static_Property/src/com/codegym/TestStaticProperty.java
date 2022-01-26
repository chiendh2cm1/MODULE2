package com.codegym;

public class TestStaticProperty {

    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        System.out.println(Car.getNumberOfCars()); //giống dòng 7.
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.getNumberOfCars());
    }
}
