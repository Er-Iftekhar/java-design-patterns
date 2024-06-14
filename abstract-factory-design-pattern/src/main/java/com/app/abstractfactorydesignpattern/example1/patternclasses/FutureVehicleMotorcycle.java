package com.app.abstractfactorydesignpattern.example1.patternclasses;

public class FutureVehicleMotorcycle implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Future Vehicle Motorcycle ");
    }
}
