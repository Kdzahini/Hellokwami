package com.kwamid.carshow484.service;

import com.kwamid.carshow484.entity.Car;
import com.kwamid.carshow484.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAllCars() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car addCar(Car car) {
        return null;
    }


}

