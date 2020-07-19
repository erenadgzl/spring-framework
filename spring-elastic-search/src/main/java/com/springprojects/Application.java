package com.springprojects;

/* 
Eren created on 19.07.2020 
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
