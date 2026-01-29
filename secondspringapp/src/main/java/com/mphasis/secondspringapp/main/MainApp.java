package com.mphasis.secondspringapp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.secondspringapp.config.SpringConfig;
import com.mphasis.secondspringapp.service.GreetService;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		GreetService greetService = container.getBean("greetService",GreetService.class);
		System.out.println(greetService.greet());
		container.close();
		container.registerShutdownHook();
	}
}
