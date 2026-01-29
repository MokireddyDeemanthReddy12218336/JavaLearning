package com.mphasis.springaop.service;

import org.springframework.stereotype.Service;

@Service("discountService")
public class DiscountService {
	public void compute() {
		System.out.println("Computing discount....");
	}
}
