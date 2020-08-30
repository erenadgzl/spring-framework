package com.springprojects.service;

/* 
Eren created on 30.08.2020 
*/

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {

    @Cacheable(cacheNames = "mySpecialCache")
    public String longRunningMethod() throws InterruptedException {
        Thread.sleep(5000L);
        return "method response";
    }

    public void clearCache(){
        System.out.println("Cache clear");
    }
}
