package com.springapp.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoginValidation {

    private UserRepository userRepository;

    @Autowired
    public LoginValidation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean credentialsAreValid(String username, String password) {
        final List<String> validUser = userRepository.findValidUser(username, password);

        if(validUser.size() == 0) {
            return false;
        }

        return true;
    }
}
