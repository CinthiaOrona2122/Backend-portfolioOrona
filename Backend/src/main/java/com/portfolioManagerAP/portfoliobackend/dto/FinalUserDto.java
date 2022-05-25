package com.portfolioManagerAP.portfoliobackend.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FinalUserDto {

    private String email;
    private String password;

    public FinalUserDto() {
    }

    public FinalUserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" + "email=" + email + ", password=" + password + '}';
    }

}
