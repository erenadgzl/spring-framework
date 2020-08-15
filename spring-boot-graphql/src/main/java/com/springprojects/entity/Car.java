package com.springprojects.entity;

/* 
Eren created on 15.08.2020 
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_car", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String brand;
    private String model;
    private String year;
}
