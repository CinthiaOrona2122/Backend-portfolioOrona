package com.portfolioManagerAP.portfoliobackend.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProgressDto {

    @NotBlank
    private String name;
    @NotBlank
    private String quote;
    @NotBlank
    private int number;

    public ProgressDto() {
    }

    public ProgressDto(String name, String quote, int number) {
        this.name = name;
        this.quote = quote;
        this.number = number;
    }

}
