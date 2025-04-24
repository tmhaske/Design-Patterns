package com.design.pattern.bridge;

public class Assembly implements Workshop{
    @Override
    public void work() {
        System.out.println("Assembling....");
    }
}
