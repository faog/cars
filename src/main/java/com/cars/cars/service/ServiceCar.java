package com.cars.cars.service;

import com.cars.cars.controllers.dto.Car;
import com.cars.cars.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCar implements IService{

    CarRepository repository;

    public ServiceCar(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> getAllCars() {
        return repository.findAll();
    }

    public void saveCar(Car car) {
        repository.save(car);
    }
}
