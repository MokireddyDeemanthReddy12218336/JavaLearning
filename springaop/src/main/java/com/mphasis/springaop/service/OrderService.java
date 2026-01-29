package com.mphasis.springaop.service;

import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {
	public void placeOrder() {
		System.out.println("Processing order....");
	}
}
