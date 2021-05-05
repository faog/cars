package com.cars.cars.controllers;

import com.cars.cars.controllers.dto.Car;
import org.springframework.web.bind.annotation.*;

@RestController
public class Products {
    @GetMapping("/car")
    public Car cart(@RequestParam String marca){
        Car car = new Car();
        car.setColor("rojo");
        car.setMarca(marca);
        car.setModelo("RAM100");
        return car;
    }

    @PostMapping("cars")
    public Car cart(@RequestBody Car car){
        return car;
    }

    @GetMapping("/cars")
    public String car() {
        return "Hola, soy un car";
    }
}
