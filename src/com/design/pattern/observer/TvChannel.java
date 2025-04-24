package com.design.pattern.observer;

public class TvChannel implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Tv Channel received "+ message);
    }
}
