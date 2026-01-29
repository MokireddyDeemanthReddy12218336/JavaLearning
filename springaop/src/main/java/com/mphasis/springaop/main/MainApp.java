package com.mphasis.springaop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.springaop.config.SpringConfig;
import com.mphasis.springaop.service.DiscountService;
import com.mphasis.springaop.service.OrderService;
import com.mphasis.springaop.service.TaxService;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext container=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		OrderService orderService = container.getBean("orderService",OrderService.class);
		orderService.placeOrder();
		
		TaxService taxService = container.getBean("taxService",TaxService.class);
		taxService.compute();
		
		DiscountService discountService = container.getBean("discountService",DiscountService.class);
		discountService.compute();
		
		container.close();
		container.registerShutdownHook();
	}
}
