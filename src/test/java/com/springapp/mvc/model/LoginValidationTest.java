package com.springapp.mvc.model;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginValidationTest {

    @Mock UserRepository userRepository;
    private LoginValidation loginValidation;
    private String username = "username";
    private String password = "password";
    private List<String> emptyList;
    private List<String> listWithOneUser;

    @Before
    public void setUp() throws Exception {
        loginValidation = new LoginValidation(userRepository);
        emptyList = new ArrayList<String>();
        listWithOneUser = new ArrayList<String>();
        listWithOneUser.add(username);

    }

    @Test
    public void returnTrueForAValidLogin() throws Exception {
        when(userRepository.findValidUser(username, password)).thenReturn(listWithOneUser);

        final boolean credentialsAreValid = loginValidation.credentialsAreValid(username, password);

        assertTrue(credentialsAreValid);
        verify(userRepository).findValidUser(username, password);
    }

    @Test
    public void returnFalseForAnInvalidLogin() throws Exception {
        when(userRepository.findValidUser(username, password)).thenReturn(emptyList);

        final boolean credentialsAreValid = loginValidation.credentialsAreValid(username, password);
        assertFalse(credentialsAreValid);
    }
}
