package com.springprojects.api;

/* 
Eren created on 15.08.2020 
*/

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.springprojects.dto.CarDto;
import com.springprojects.entity.Car;
import com.springprojects.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CarMutationResolver implements GraphQLMutationResolver {

    private final CarRepository carRepository;

    public Car createCar(CarDto carDto){
        return carRepository.save(dtoToEntity(carDto));
    }

    private Car dtoToEntity(CarDto carDto){
        Car car = new Car();
        car.setBrand(carDto.getBrand());
        car.setYear(carDto.getYear());
        car.setModel(carDto.getModel());
        return car;
    }
}
