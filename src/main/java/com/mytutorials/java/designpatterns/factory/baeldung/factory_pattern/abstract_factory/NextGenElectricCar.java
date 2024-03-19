package com.mytutorials.java.designpatterns.factory.baeldung.factory_pattern.abstract_factory;

public class NextGenElectricCar implements ElectricVehicle {

    @Override
    public void build() {
        System.out.println("NextGen Electric Car");
    }
}
