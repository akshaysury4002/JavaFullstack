package com.as.boot.service;

import org.springframework.stereotype.Service;

import com.as.boot.entity.Car;

@Service
public class CarService {
    
    public void createNewCar(Long id, String make, String model) {

        Car car = new Car();
        car.setId(id);
        car.setMake(make);
        car.setModel(model);
        System.out.println(car.toString());
    }
}
