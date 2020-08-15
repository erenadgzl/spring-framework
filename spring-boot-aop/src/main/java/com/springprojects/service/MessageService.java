package com.springprojects.service;

/* 
Eren created on 15.08.2020 
*/

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String getMessage(String message){
        System.out.println("MessageService:" + message);
        return message;
    }
}
