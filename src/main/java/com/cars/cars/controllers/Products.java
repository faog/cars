package com.cars.cars.controllers;

import com.cars.cars.controllers.dto.Car;
import com.cars.cars.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Products {

    @Autowired
    private IService service;

    Products(IService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public List<Car> cart(){

        return this.service.getAllCars();
    }

    @PostMapping("car")
    public ResponseEntity<Car> cart(@RequestBody Car car){
        this.service.saveCar(car);
        return ResponseEntity.noContent().build();
    }

}