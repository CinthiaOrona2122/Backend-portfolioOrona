package com.portfolioManagerAP.portfoliobackend.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationDto {

    @NotBlank
    private String school_name;
    @NotBlank
    private String title;
    @NotBlank
    private String career;
    @NotBlank
    private String url_img;
    @NotBlank
    private String edu_type;
    @NotBlank
    private String url;
    @NotBlank
    private String dateStart;
    @NotBlank
    private String dateEnd;
    @NotBlank
    private int score;

    public EducationDto() {
    }

    public EducationDto(@NotBlank String school_name, @NotBlank String title, 
            @NotBlank String career, @NotBlank String url_img, @NotBlank String edu_type, 
            @NotBlank String url, @NotBlank String dateStart, @NotBlank String dateEnd, @NotBlank int score) {
        this.school_name = school_name;
        this.title = title;
        this.career = career;
        this.url_img = url_img;
        this.edu_type = edu_type;
        this.url = url;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.score = score;
    }
}
