package com.cars.cars.repository;

import com.cars.cars.controllers.dto.Car;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CarRepository extends MongoRepository<Car, String> {
    public List<Car> findByColor(String color);
}
