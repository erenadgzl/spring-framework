package com.springprojects.repository;

/* 
Eren created on 15.08.2020 
*/

import com.springprojects.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> getByBrandLike(String brand);
}
