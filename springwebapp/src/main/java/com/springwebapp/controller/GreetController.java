package com.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springwebapp.service.LoginService;

@Controller
public class GreetController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/greet",method=RequestMethod.GET)
	public String greet() {
		return "greetpage";
	}
	
	@GetMapping("/mphasis")
	public String mphasis() {
		return "mphasispage";
	}
	
	@GetMapping("/login")
	public String login() {
		return "loginpage";
	}
	
	@PostMapping("/dologin")
	public String dologin(@RequestParam("lg") String login , 
			@RequestParam("pw") String password , Model model) {
		if(loginService.check(login, password)) {
			model.addAttribute("user",login);
			return "welcomepage";
		}
		else {
			model.addAttribute("error","Invalid Login Details!!");
			return "loginpage";
		}
	}
}
