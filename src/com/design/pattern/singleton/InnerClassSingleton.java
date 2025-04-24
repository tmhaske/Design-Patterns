package com.design.pattern.singleton;

public class InnerClassSingleton {
    private InnerClassSingleton(){}
    private static  class Holder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
    public static InnerClassSingleton getInsatce(){
        return Holder.instance;
    }

}
