package com.mytutorials.java.designpatterns.factory.baeldung.factory_pattern.abstract_factory;

public class FutureVehicleCorporation extends Corporation {

    @Override
    public MotorVehicle createMotorVehicle() {
        return new FutureVehicleMotorcycle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new FutureVehicleElectricCar();
    }
}
