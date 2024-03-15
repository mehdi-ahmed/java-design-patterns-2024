package com.mytutorials.java.designpatterns.singleton.digitalocean;

public class Main {

    public static void main(String[] args) {

        // Getting an instance
        EagerInitializedSingleton e = EagerInitializedSingleton.getInstance();
        System.out.println("instance = " + e);

    }
}
