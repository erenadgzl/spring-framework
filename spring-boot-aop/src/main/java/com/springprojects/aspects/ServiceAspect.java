package com.springprojects.aspects;

/* 
Eren created on 15.08.2020 
*/

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.springprojects.service.*.getMessage(..))")
    public void beforeGetMessage(JoinPoint joinPoint){
        System.out.println("Before:" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.springprojects.service.*.getMessage(..))")
    public void afterGetMessage(JoinPoint joinPoint){
        System.out.println("After:" + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
