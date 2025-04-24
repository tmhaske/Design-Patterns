package com.design.pattern.observer;

public class MobileApp implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Mobile app received "+ message);
    }
}
