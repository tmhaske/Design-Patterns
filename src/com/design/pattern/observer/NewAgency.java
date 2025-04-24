package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class NewAgency implements Subject{
    private List<Observer> list = new ArrayList<>();
    private String news;
    @Override
    public void addSubscriber(Observer o) {
        list.add(o);
    }
    @Override
    public void removeSubscriber(Observer o) {
        list.remove(o);
    }

    public void setNews(String msg){
        this.news = msg;
        notifyObserver();
    }
    @Override
    public void notifyObserver() {
        for(Observer obs : list){
            obs.update(news);
        }
    }
}
