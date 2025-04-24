package com.design.pattern.bridge;

public class Car extends Vehicle {

    public Car(Workshop wp1, Workshop wp2) {
        super(wp1, wp2);
    }

    @Override
    void manufacture() {
        System.out.println("Car ::");
        workshop1.work();
        workshop2.work();
    }
}
