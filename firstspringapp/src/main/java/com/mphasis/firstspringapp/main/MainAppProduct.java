package com.mphasis.firstspringapp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mphasis.firstspringapp.model.Product;

public class MainAppProduct {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container =
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		Product p = container.getBean("product",Product.class);
		
		System.out.println(p.getId()+","+p.getName()+","+p.getPrice()+","+p.getColorVariants());
		p.setPrice(2000);
		
		Product p2 = container.getBean("product",Product.class);
		System.out.println(p2.getId()+","+p2.getName()+","+p2.getPrice()+","+p2.getColorVariants());
		
		container.close();
		container.registerShutdownHook();
		
		
	}
}
