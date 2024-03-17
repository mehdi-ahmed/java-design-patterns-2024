package com.mytutorials.java.designpatterns.singleton.digitalocean.test;

import com.mytutorials.java.designpatterns.singleton.digitalocean.EagerInitializedSingleton;

import java.lang.reflect.Constructor;

/*
 * Java Reflection can cancel Singleton
 */

public class ReflectionSingletonTest {

    public static void main(String[] args) {

        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("instanceOne = " + instanceOne); // EagerInitializedSingleton@5f184fc6
        System.out.println("instanceTwo = " + instanceTwo); //EagerInitializedSingleton@6f496d9f
    }
}
