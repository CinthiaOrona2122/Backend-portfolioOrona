package com.portfolioManagerAP.portfoliobackend.controller;

import com.portfolioManagerAP.portfoliobackend.dto.FinalUserDto;
import com.portfolioManagerAP.portfoliobackend.entity.FinalUser;
import com.portfolioManagerAP.portfoliobackend.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class AuthUserController {

    @Autowired
    AuthUserService authUserService;
        
    @PostMapping("/login")
    public boolean login(@RequestBody FinalUserDto finalUserDto) {
        System.out.println("Usuario logeado: " +  finalUserDto);
        return authUserService.isUserEnabled(finalUserDto);
    }  
    

    @PostMapping("/register")
    public void register(@RequestBody FinalUser finalUser) throws Exception {
        authUserService.createUser(finalUser);
    }
}
