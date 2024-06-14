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
        SpringApplication.run(FactoryDesignPatternApplication.class, args);
    }

}
