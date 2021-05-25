package com.cars.cars.service;

import com.cars.cars.controllers.dto.Car;

import java.util.List;
import java.util.Optional;

public interface IService {
    public void saveCar(Car car);

    public List<Car> getAllCars();

    public List<Car> findByColor(String color);

    public Car findById(String id);
}
