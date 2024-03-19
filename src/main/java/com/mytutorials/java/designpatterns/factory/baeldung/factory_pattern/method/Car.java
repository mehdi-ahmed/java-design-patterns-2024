package com.mytutorials.java.designpatterns.factory.baeldung.factory_pattern.method;

public class Car implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
