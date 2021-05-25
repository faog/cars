package com.cars.cars.service;

import com.cars.cars.controllers.dto.Car;

import java.util.List;

public interface IService {
    public void saveCar(Car car);

    public List<Car> getAllCars();
}
