package com.design.pattern.bridge;

public class Truck extends Vehicle{
    public Truck(Workshop wp1, Workshop wp2){
        super(wp1,wp2);
    }
    @Override
    void manufacture() {
        System.out.println("Truck :: ");
        workshop1.work();
        workshop2.work();
    }


}
