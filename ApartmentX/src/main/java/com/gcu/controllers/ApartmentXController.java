package com.gcu.apartmentx.controllers;


import com.gcu.models.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApartmentXController {
	
	@GetMapping("/")
    public ModelAndView homepage() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Test Homepage");
        mav.setViewName("Homepage");
        return mav;
    }
    
    @GetMapping("/login")
    public String display(Model model){
        model.addAttribute("title", "Login Form");
        model.addAttribute("loginModel", new LoginModel());
        return "Login";
    }



    @GetMapping("/register")
    public String register() {
    	return "Register";
    }


}
