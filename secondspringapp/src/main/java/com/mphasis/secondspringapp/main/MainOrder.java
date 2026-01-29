package com.mphasis.secondspringapp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.secondspringapp.config.SpringConfig;
import com.mphasis.secondspringapp.service.OrderService;

public class MainOrder {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		OrderService orderService =container.getBean("orderService",OrderService.class);
		orderService.placeOrder();
		container.close();
		container.registerShutdownHook();
	}
}
