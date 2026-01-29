package com.mphasis.secondspringapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mphasis.secondspringapp.service.EmailConfig;
import com.mphasis.secondspringapp.service.EmailService;
import com.mphasis.secondspringapp.service.GreetService;
import com.mphasis.secondspringapp.service.OrderService;

@Configuration
@ComponentScan(basePackages  = {"com.mphasis.secondspringapp"})
public class SpringConfig {
	
	//No need of Bean id the method name will be considered as the Bean id
//	@Bean
//	@Scope("singleton")
//	public GreetService greetService() {
//		return new GreetService();
//	}
	
	@Bean
	@Scope("singleton")
	public EmailService emailService() {
		EmailService es =new EmailService();
		es.setEmailconfig(emailConfig());
		return es;
	}
	
	@Bean
	@Scope("singleton")
	public OrderService orderService() {
		return  new OrderService(emailService());
	}
	
	@Bean
	@Scope("singleton")
	public EmailConfig emailConfig() {
		EmailConfig ec =new EmailConfig("192.168.12.2","HYU7998@#");
		return ec;
		
	}
	
	
}
