package com.app.factorydesignpattern.example1.patternclasses;

public class Car implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Build car");
    }
}
