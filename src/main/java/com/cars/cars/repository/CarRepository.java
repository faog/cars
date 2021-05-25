package com.cars.cars.repository;

import com.cars.cars.controllers.dto.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {

}
