package com.app.abstractfactorydesignpattern.example1.patternclasses;

public class NextGenMotorcycle implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Next Gen Motorcycle");
    }
}
