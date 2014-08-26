package com.springapp.mvc.controller;

import com.springapp.mvc.model.LoginValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    private LoginValidation loginValidation;

    @RequestMapping("/")
    public String returnLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        final boolean credentialsAreValid = loginValidation.credentialsAreValid(username, password);
        if (credentialsAreValid) {
            return "redirect:/home";
        }
        return "login";
    }

}
