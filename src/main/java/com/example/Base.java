package com.example;

public class Base {
    public void getSomething() {
        System.out.println("Base.getSomething");
        doSomething();
    }

    public void doSomething() {
        System.out.println("Base.doSomething");
    }

}
