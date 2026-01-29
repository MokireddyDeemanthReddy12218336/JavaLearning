package com.mphasis.springaop.service;

import org.springframework.stereotype.Service;

@Service("taxService")
public class TaxService {
	public void compute() {
		System.out.println("Computing tax.....");
	}
}
