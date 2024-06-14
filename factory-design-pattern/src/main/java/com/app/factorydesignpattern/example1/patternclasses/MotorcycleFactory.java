package com.app.factorydesignpattern.example1.patternclasses;

public class MotorcycleFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}
