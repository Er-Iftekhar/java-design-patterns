package com.app.factorydesignpattern.example1.clientclass;

import com.app.factorydesignpattern.example1.patternclasses.CarFactory;
import com.app.factorydesignpattern.example1.patternclasses.MotorVehicle;
import com.app.factorydesignpattern.example1.patternclasses.MotorVehicleFactory;
import com.app.factorydesignpattern.example1.patternclasses.MotorcycleFactory;

public class FactoryPatternClient {
    public static void main(String[] args) {
        MotorVehicleFactory motorcycleFactory = new MotorcycleFactory();
        MotorVehicle vehicle = motorcycleFactory.create();
        vehicle.build();
        System.out.println("---------------------------------------------");
        MotorVehicleFactory carFactory = new CarFactory();
        vehicle = carFactory.create();
        vehicle.build();
    }
}
