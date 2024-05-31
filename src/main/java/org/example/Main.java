package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle =  new Vehicle("VW", "Golf", 2020);
        Car car = new Car("Volvo", "C30", 2012, 3);

        System.out.println(vehicle);
        System.out.println(car);
    }
}