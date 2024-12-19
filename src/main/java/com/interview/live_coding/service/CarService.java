package com.interview.live_coding.service;

import com.interview.live_coding.entity.CarEntity;
import com.interview.live_coding.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarEntity create(CarEntity carEntity){
        return carRepository.save(carEntity);
    }

    public List<CarEntity> getAllCars(){
        return carRepository.findAll();
    }
}
