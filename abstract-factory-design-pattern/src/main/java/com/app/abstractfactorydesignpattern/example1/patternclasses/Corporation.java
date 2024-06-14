package com.app.abstractfactorydesignpattern.example1.patternclasses;

public abstract class Corporation {
    public abstract MotorVehicle createMotorVehicle();
    public abstract ElectricVehicle createElectricVehicle();
}
