package com.mphasis.secondspringapp.service;

import org.springframework.stereotype.Service;

@Service("greetService")
public class GreetService {
	public String greet() {
		return "Welcome to Java based Configuration";
	}
}
