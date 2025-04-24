package com.design.pattern.singleton;

public class main {
    public static void main(String[] args) {
        // Lazy Singletone
        System.out.println("Lazy Singletone");
        LazySingleton ls = LazySingleton.getInstance();
        System.out.println(ls.hashCode());
        LazySingleton ls1 = LazySingleton.getInstance();
        System.out.println(ls1.hashCode());

        // Double Checked Lazy Singletone
        System.out.println("Double Checked Lazy Singletone");
        DoubleCheckedLazy dcs = DoubleCheckedLazy.getInstance();
        System.out.println(dcs.hashCode());
        DoubleCheckedLazy dcs1 = DoubleCheckedLazy.getInstance();
        System.out.println(dcs1.hashCode());

        // Enum Singleton
        System.out.println("Enum Singletone");
        EnumSingleton es1 = EnumSingleton.INSTANCE;
        System.out.println(es1.hashCode());
        EnumSingleton es2 = EnumSingleton.INSTANCE;
        System.out.println(es2.hashCode());

        // Eger Singleton
        System.out.println("Eger Singletone");
        EgerSingleton eg1 = EgerSingleton.getInstance();
        System.out.println(eg1.hashCode());
        EgerSingleton eg2 = EgerSingleton.getInstance();
        System.out.println(eg2.hashCode());

        // Inner Singleton
        System.out.println("Inner Singletone");
        InnerClassSingleton is = InnerClassSingleton.getInsatce();
        System.out.println(is.hashCode());
        InnerClassSingleton is1 = InnerClassSingleton.getInsatce();
        System.out.println(is1.hashCode());

    }
}
