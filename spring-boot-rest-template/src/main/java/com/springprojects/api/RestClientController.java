package com.springprojects.api;

/* 
Eren created on 16.08.2020 
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("/test")
public class RestClientController {

    @Autowired
    private RestTemplate restTemplate;

    private final String webUrl = "http://localhost:8081/users";

    @GetMapping
    public ResponseEntity getUserList(){
        ResponseEntity responseEntity = restTemplate.getForEntity(webUrl, List.class);
        return responseEntity;
    }
}
