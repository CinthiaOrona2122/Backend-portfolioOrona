package com.portfolioManagerAP.portfoliobackend.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AptitudeDto {

    @NotBlank
    private String name;
    @NotBlank
    private String confirmerName;
    @NotBlank
    private String description;

    public AptitudeDto() {
    }

    public AptitudeDto(@NotBlank String name, @NotBlank String confirmerName, @NotBlank String description) {
        this.name = name;
        this.confirmerName = confirmerName;
        this.description = description;
    }

}
