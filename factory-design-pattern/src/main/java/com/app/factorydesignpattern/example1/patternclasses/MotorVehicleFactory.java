package com.app.factorydesignpattern.example1.patternclasses;

public abstract class MotorVehicleFactory {
    public MotorVehicle create(){
        return createMotorVehicle();
    }
    protected abstract MotorVehicle createMotorVehicle();
}
