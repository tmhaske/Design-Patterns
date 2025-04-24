package com.design.pattern.bridge;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(new Painting(),new Assembly());
        car.manufacture();
        System.out.println();
        Bike bike = new Bike(new Painting(),new Assembly());
        bike.manufacture();
        System.out.println();
        Truck truck = new Truck(new Produce(),new Assembly());
        truck.manufacture();
    }
}
