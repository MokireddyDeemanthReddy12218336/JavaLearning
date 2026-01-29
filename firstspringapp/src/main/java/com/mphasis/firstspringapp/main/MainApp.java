package com.mphasis.firstspringapp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.firstspringapp.service.GreetService;
import com.mphasis.firstspringapp.service.OrderService;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container =
				new ClassPathXmlApplicationContext("spring-config.xml");
//		GreetService greetService = container.getBean("greetService",GreetService.class);
//		
//		System.out.println(greetService.greet());
		
		OrderService orderService = container.getBean("orderService",OrderService.class);
		orderService.placeOrder();
		container.close();
		container.registerShutdownHook();
		
		
	}
}
