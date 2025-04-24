package com.design.pattern.singleton;

public class DoubleCheckedLazy {
    private static volatile DoubleCheckedLazy singletonPattern;
    private DoubleCheckedLazy() {
    }
    public static DoubleCheckedLazy getInstance() {
        if (singletonPattern == null) {
            synchronized (DoubleCheckedLazy.class) {
                if (singletonPattern == null) {
                    singletonPattern = new DoubleCheckedLazy();
                }
            }
        }
        return singletonPattern;
    }
}

