package com.springprojects.controller;

/* 
Eren created on 19.07.2020 
*/

import com.springprojects.dto.UserDto;
import com.springprojects.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.save(userDto));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll(){
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long userId){
        return ResponseEntity.ok(userService.getUser(userId));
    }
}
