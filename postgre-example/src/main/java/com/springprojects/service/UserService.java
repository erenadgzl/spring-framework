package com.springprojects.service;

/* 
Eren created on 19.07.2020 
*/

import com.springprojects.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto save(UserDto userDto);

    UserDto getUser(Long id);

    List<UserDto> getAll();
}
