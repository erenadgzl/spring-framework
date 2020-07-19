package com.springprojects;

/* 
Eren created on 19.07.2020 
*/

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Car Model")
public class Car {

    @ApiModelProperty(value = "Car id")
    private int id;

    @ApiModelProperty(value = "Car brand")
    private String brand;

    @ApiModelProperty(value = "Car model")
    private String model;

    @ApiModelProperty(value = "Car year")
    private String year;
}
