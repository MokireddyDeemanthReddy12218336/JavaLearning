package com.mphasis.springaop.aspect;


import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component("logAspect")
@Order(value = 2)
public class LogAspect {
	//@Before("execution (* com.mphasis.springaop.service.OrderService.placeOrder(..))")
	//@Before("execution (* com.mphasis.springaop.service.*.*(..))")
	public void logBefore() {
		System.out.println("Log before.... "+LocalDateTime.now() );
	}
	//@After("execution(* com.mphasis.springaop.service.OrderService.placeOrder(..))")
	//@After("execution(* com.mphasis.springaop.service.*.*(..))")
	public void logAfter() {
		System.out.println("Log after.... "+LocalDateTime.now() );
	}
	
	@Around("execution(* com.mphasis.springaop.service.*.*(..))")
	public void BeforeAndAfter(ProceedingJoinPoint pj) {
		logBefore();
		try {
			pj.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logAfter();
	}
}
