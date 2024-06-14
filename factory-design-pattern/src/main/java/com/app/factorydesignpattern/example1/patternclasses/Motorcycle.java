package com.app.factorydesignpattern.example1.patternclasses;

public class Motorcycle implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Build Motorcycle");
    }
}
