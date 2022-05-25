package com.portfolioManagerAP.portfoliobackend.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDto {

    @NotBlank   
    private String name;
    @NotBlank
    private String lastname;
    @NotBlank
    private Long cuit;
    @NotBlank
    private String url_img;
    @NotBlank
    private String interest;
    
    private String birthday;
    @NotBlank
    private String location;

    public PersonDto() {
    }

    public PersonDto(@NotBlank String name, @NotBlank String lastname, Long cuit, 
            @NotBlank String url_img, @NotBlank String interest, @NotBlank String birthday, @NotBlank String location) {
        this.name = name;
        this.lastname = lastname;
        this.cuit = cuit;
        this.url_img = url_img;
        this.interest = interest;
        this.birthday = birthday;
        this.location = location;
    }

}
