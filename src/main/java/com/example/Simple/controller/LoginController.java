package com.example.Simple.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api")
public class LoginController {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "/login" ,method= RequestMethod.GET)
	public String loginPage() {
		return"login";
	}
	
	
	
	@GetMapping(path="/login1")
	public ModelAndView loginPage1() {
		
		
		return new ModelAndView("login");
	}
	
	
	
}
