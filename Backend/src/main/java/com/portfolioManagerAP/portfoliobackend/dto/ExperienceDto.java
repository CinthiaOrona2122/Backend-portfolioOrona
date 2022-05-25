package com.portfolioManagerAP.portfoliobackend.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExperienceDto {

    @NotBlank
    private String job_position;
    @NotBlank
    private String company_name;
    @NotBlank    
    private String url_img;
    @NotBlank
    private String job_type;
    @NotBlank
    private String dateStart;
    @NotBlank
    private String dateEnd;
    @NotBlank
    private String url;

    public ExperienceDto() {
    }

    public ExperienceDto(@NotBlank String job_position, @NotBlank String company_name, 
            @NotBlank String url_img, @NotBlank String job_type, @NotBlank String dateStart, @NotBlank String dateEnd, @NotBlank String url) {
        this.job_position = job_position;
        this.company_name = company_name;
        this.url_img = url_img;
        this.job_type = job_type;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.url = url;
    }

}
