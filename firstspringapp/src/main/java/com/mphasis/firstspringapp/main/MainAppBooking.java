package com.mphasis.firstspringapp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.service.MovieBookingService;

public class MainAppBooking {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext container =
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		MovieBookingService ms=container.getBean("movieBookingService",MovieBookingService.class);
		ms.bookTicket(3);
		container.close();
		container.registerShutdownHook();
	}
}
