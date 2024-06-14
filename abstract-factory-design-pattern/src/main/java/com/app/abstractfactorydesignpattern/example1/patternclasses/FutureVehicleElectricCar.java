package com.app.abstractfactorydesignpattern.example1.patternclasses;

public class FutureVehicleElectricCar implements ElectricVehicle{
    @Override
    public void build() {
        System.out.println("Future Vehicle Electric car");
    }
}
