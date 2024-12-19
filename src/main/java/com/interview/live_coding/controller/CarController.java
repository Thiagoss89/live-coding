package com.interview.live_coding.controller;

import com.interview.live_coding.entity.CarEntity;
import com.interview.live_coding.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cars")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<CarEntity>> getAllCars(){
        return ResponseEntity.ok(carService.getAllCars());
    }

    @PostMapping
    public ResponseEntity<CarEntity> create(@RequestBody CarEntity carEntity){
        return ResponseEntity.status(201).body(carService.create(carEntity));
    }
}
