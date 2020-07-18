package com.springprojects;

/* 
Eren created on 18.07.2020 
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
