package com.gcu.apartmentx.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApartmentXController {
	
	@GetMapping("/")
    public String homepage() {
    	return "Homepage";
    }
    
    @GetMapping("/login")
    public String login() {
    	return "Login";
    }
    
    @GetMapping("/register")
    public String register() {
    	return "Register";
    }
}
