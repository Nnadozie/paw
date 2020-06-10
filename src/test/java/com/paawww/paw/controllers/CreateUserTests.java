package com.paawww.paw.controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import ch.qos.logback.core.status.Status;

@RunWith(SpringRunner.class)
@WebMvcTest(CreateUserController.class)
public class CreateUserTests {
    @Autowired
    private MockMvc mockMvc;

    //@MockBean
    //UserService userService;

    @Test
    public void createNewUser() throws Exception {
        // mockMvc.perform(post("/auth/create-user"))
        //         .andExpect(Status().isOk())
        //         .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        //         .andExpect(content().json("[]"));
    }
    
}