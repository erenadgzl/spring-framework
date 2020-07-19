package com.springprojects;

/* 
Eren created on 19.07.2020 
*/

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
@Api(value = "Car API document")
public class CarController {

    private List<Car> carList = new ArrayList<>();

    @PostConstruct
    public void init(){
        carList.add(new Car(1,"BMW","e30","1990"));
    }

    @PostMapping
    @ApiOperation(value = "Save Car Method")
    public ResponseEntity<Car> save(@RequestBody Car car){
        carList.add(car);
        return ResponseEntity.ok(car);
    }

    @GetMapping
    @ApiOperation(value = "Get All Car Method")
    public ResponseEntity<List<Car>> getAll(){
        return ResponseEntity.ok(carList);
    }
}
