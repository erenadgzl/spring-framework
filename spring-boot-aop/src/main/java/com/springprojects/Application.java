package com.springprojects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
Eren created on 15.08.2020 
*/
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
