package com.springapp.mvc.controller;

import com.springapp.mvc.model.Login;
import com.springapp.mvc.model.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @RequestMapping("/")
    public String doSomethingToTest() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("login") Login login, BindingResult result) {
        return "redirect:/home";
    }

}
