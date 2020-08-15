package com.springprojects.api;

/* 
Eren created on 15.08.2020 
*/

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.springprojects.entity.Car;
import com.springprojects.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CarQueryResolver implements GraphQLQueryResolver {

    private final CarRepository carRepository;

    public List<Car> getCarList(String brand){
        return carRepository.getByBrandLike(brand);
    }

    public Optional<Car> getCar(Long id){
        return carRepository.findById(id);
    }
}
