package com.design.pattern.observer;

public class Main {
    public static void main(String[] args) {
        NewAgency news = new NewAgency();
        Observer tv = new TvChannel();
        Observer mobile = new MobileApp();

        news.addSubscriber(tv);
        news.addSubscriber(mobile);

        news.setNews("This News is for both Mobile and Tv");
        news.removeSubscriber(tv);
        System.out.println();
        news.setNews("This News only for Mobile");

    }
}
