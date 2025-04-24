package com.design.pattern.bridge;

public class Painting implements Workshop{
    @Override
    public void work() {
        System.out.println("Painting .... ");
    }
}
