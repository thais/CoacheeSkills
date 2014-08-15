package com.springapp.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {



    @RequestMapping("/login")
    public String doSomethingToTest() {
        return "login";
    }

    @RequestMapping(value = "/login/login", method = RequestMethod.POST)
    public String login() {

        return "redirect:/objectives";
    }

}
