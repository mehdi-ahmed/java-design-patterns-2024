package com.mytutorials.java.designpatterns.factory.baeldung.factory_pattern.method;

public class Motorcycle implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
