package com.app.abstractfactorydesignpattern.example1.patternclasses;

public class NextGenElectricCar implements ElectricVehicle{
    @Override
    public void build() {
        System.out.println("Next Gen Electric Car");
    }
}
