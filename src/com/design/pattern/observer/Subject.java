package com.design.pattern.observer;

public interface Subject {

    void addSubscriber(Observer o);
    void removeSubscriber(Observer o);
    void notifyObserver();
}
