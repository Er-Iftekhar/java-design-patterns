package com.app.factorydesignpattern;

import com.app.factorydesignpattern.example1.patternclasses.CarFactory;
import com.app.factorydesignpattern.example1.patternclasses.MotorVehicle;
import com.app.factorydesignpattern.example1.patternclasses.MotorVehicleFactory;
import com.app.factorydesignpattern.example1.patternclasses.MotorcycleFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryDesignPatternApplication {

    public static void main(String[] args) {
        MotorVehicleFactory motorcycleFactory = new MotorcycleFactory();
        MotorVehicle vehicle = motorcycleFactory.create();
        vehicle.build();
        System.out.println("---------------------------------------------");
        MotorVehicleFactory carFactory = new CarFactory();
        vehicle = carFactory.create();
        vehicle.build();
        SpringApplication.run(FactoryDesignPatternApplication.class, args);
    }

}
