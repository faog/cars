package com.cars.cars.controllers.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Setter
@Getter
public class Car {
    @Id
    String id;
    String color;
    String marca;
    String modelo;
}
