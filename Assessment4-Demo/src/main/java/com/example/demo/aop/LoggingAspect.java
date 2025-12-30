package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.school.studentservice.service.*.*(..))")
    public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long executionTime = System.currentTimeMillis() - start;

        System.out.println("Method: " + joinPoint.getSignature());
        System.out.println("Arguments: " + joinPoint.getArgs());
        System.out.println("Execution Time: " + executionTime + "ms");

        return result;
    }
}

