package com.portfolioManagerAP.portfoliobackend.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AchievementDto {

    @NotBlank
    private String name;
    @NotBlank
    private String description;
    @NotBlank
    private String url;
    @NotBlank
    private String project_type;

    public AchievementDto() {
    }

    public AchievementDto(@NotBlank String name, @NotBlank String description, @NotBlank String url, @NotBlank String project_type) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.project_type = project_type;
    }

}
