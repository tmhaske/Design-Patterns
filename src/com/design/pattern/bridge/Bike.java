package com.design.pattern.bridge;

public class Bike extends Vehicle {
    public Bike(Workshop wp1, Workshop wp2) {
        super(wp1, wp2);
    }

    public void manufacture() {
        System.out.println("Bike ::");
        workshop1.work();
        workshop2.work();
    }
}
