package com.kwamid.carshow484.service;

import com.kwamid.carshow484.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();

    Car addCar(Car car);
}
