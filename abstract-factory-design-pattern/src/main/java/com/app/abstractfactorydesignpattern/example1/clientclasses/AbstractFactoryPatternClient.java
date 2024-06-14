package com.app.abstractfactorydesignpattern.example1.clientclasses;

import com.app.abstractfactorydesignpattern.example1.patternclasses.*;

public class AbstractFactoryPatternClient {
    public static void main(String[] args) {
        // TODO the usage of this example is not clear, need to work again on this example.
        MotorVehicle motorVehicle = new FutureVehicleMotorcycle();
        motorVehicle.build();
        ElectricVehicle electricVehicle = new FutureVehicleElectricCar();
        electricVehicle.build();
        Corporation futureVehicleCorporation = new FutureVehicleCorporation();
        futureVehicleCorporation.createElectricVehicle();
        futureVehicleCorporation.createMotorVehicle();
    }
}
