package com.mphasis.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 1)
public class SecurityAspect {
	@Before("execution(* com.mphasis.springaop.service.*.*(..))")
	public void doCheck() {
		System.out.println("Checking security aspects....");
	}
}
