package org.example;

public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String manufacturer, String model, int yearOfManufacture, int numOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                ", numOfDoors=" + numOfDoors +
                '}';
    }
}
