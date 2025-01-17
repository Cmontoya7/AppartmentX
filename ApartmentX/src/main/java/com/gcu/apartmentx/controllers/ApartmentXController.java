package com.gcu.apartmentx.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.gcu.apartmentx.ApartmentXUser;

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
    
    @PostMapping("/register/submitRegistration") //TEMP will direct to database
    public String submitRegistrationForm(@ModelAttribute ApartmentXUser user) {
    	System.out.println(user.toString());
    	return "RegisterSuccess";
    }
}
