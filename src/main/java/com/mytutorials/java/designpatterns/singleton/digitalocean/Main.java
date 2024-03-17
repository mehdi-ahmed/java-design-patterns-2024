package com.mytutorials.java.designpatterns.singleton.digitalocean;

public class Main {

    public static void main(String[] args) {

        // Getting an instance -  EagerInitializedSingleton
        EagerInitializedSingleton eagerInstance = EagerInitializedSingleton.getInstance();
        System.out.println("instance = " + eagerInstance);


        // Getting an instance -  StaticBlockSingleton
        StaticBlockSingleton staticBlockInstance = StaticBlockSingleton.getInstance();
        System.out.println("instance = " + staticBlockInstance);


        // etc.

    }
}
