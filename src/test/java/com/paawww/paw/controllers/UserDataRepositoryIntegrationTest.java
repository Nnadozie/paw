package com.paawww.paw.controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(CreateUserController.class)
public class CreateUserTests {
    @Autowired
    //private MockMvc mockMvc;

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