package com.cars.cars.controllers.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {
    String color;
    String marca;

    @JsonIgnore
    String modelo;
}
