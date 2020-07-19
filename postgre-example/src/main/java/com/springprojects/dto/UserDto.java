package com.springprojects.dto;

/* 
Eren created on 19.07.2020 
*/

import lombok.Data;

import java.util.List;

@Data
public class UserDto {

    private Long id;

    private String name;

    private String surname;

    private List<String> addressList;
}
