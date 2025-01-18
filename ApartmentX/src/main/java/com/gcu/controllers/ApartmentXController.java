package com.gcu.apartmentx.controllers;


import com.gcu.models.ApartmentXUser;
import com.gcu.models.LoginModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


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
    public String doLogin(@Valid LoginModel loginModel2, BindingResult bindingResult, Model model){

        if (bindingResult.hasErrors()){
            model.addAttribute("title", "Login");
            return "Login";
        } else {
            System.out.println("received Login: " + loginModel2.toString());
            loginModel.loginTrue();
            loginModel.setUsername(loginModel2.getUsername());
            return "redirect:/";
        }
    }


    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("title", "Registration");
        model.addAttribute("user", new ApartmentXUser());
    	return "Register";
    }

    @PostMapping("/register/submitRegistration") //TEMP will direct to database
    public String submitRegistrationForm(@ModelAttribute ApartmentXUser user) {
        System.out.println("received registration: " + user.toString());
        return "RegisterSuccess";
    }
}
