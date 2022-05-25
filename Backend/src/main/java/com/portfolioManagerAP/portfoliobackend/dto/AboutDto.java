package com.portfolioManagerAP.portfoliobackend.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AboutDto {

    @NotBlank
    private String text;

    public AboutDto() {
    }

    public AboutDto(@NotBlank String text) {
        this.text = text;
    }

    

}
