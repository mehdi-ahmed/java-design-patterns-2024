package com.mytutorials.java.designpatterns.singleton.digitalocean;

public class LazyInitializedSingleton {

    public static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
