package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.BookService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("[LoggingAspect] Before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.library.service.BookService.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("[LoggingAspect] After method: " + joinPoint.getSignature().getName());
    }
}
