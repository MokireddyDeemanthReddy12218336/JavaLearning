package com.mphasis.firstspringapp.service;

public class GreetService {
	
	public void  init() {
		System.out.println("In inti method od GreetService...");
	}
	
	public String greet() {
		return "Welcome to Spring Happy Learning!!";
	}
	
	public void destroy() {
		System.out.println("In destroy method od GreetService...");
	}
}
