package com.gucheng;

public class SingletonTest {
    private static volatile SingletonTest instance = null;

    public static SingletonTest getInstance() {
        if (instance == null) {
            synchronized(SingletonTest.class) {
                if (instance == null) {
                    instance = new SingletonTest();
                }
            }
        }
        return instance;
    }

    private SingletonTest() {

    }

    public static void main(String[] args) {
        SingletonTest singletonTest = getInstance();
        singletonTest.printHello();
    }

    public void printHello() {
        System.out.println("Hello singleton");
    }
}
