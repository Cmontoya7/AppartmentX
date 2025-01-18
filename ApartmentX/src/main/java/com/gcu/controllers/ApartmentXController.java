package com.gcu.apartmentx.controllers;


import com.gcu.models.LoginModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ApartmentXController {
    private final LoginModel loginModel = new LoginModel();

    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("title", "Welcome to Apartment X");
        model.addAttribute("loginModel", loginModel);
        model.addAttribute("username", loginModel.getUsername());
        model.addAttribute("loggedIn", loginModel.isLoggedIn());
        return "Homepage";
    }

    @GetMapping("/login")
    public String display(Model model){
        model.addAttribute("title", "Login");
        model.addAttribute("loginModel", loginModel);
        model.addAttribute("username", loginModel.getUsername());
        model.addAttribute("loggedIn", loginModel.isLoggedIn());
        return "Login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@Valid LoginModel loginmodel2, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            model.addAttribute("title", "Login Form");
            return "Login";
        } else {
            loginModel.loginTrue();
            loginModel.setUsername(loginmodel2.getUsername());
            return "redirect:/";
        }
    }


    @GetMapping("/register")
    public String register() {
    	return "Register";
    }


}
