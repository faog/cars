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

    public List<Car> findByColor(String color) {
        return this.repository.findByColor(color);
    }

    public Car findById(String id){
        return this.repository.findById(id).get();
    }

    public void saveCar(Car car) {
        repository.save(car);
    }
}
