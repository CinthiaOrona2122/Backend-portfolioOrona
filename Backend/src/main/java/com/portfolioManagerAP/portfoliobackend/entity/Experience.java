package com.portfolioManagerAP.portfoliobackend.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experience implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String job_position;
    private String company_name;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String url_img;
    private String job_type;
    private String dateStart;
    private String dateEnd;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String url;

    public Experience() {
    }

    public Experience(String job_position, String company_name, String url_img, String job_type, String dateStart, String dateEnd, String url) {
        this.job_position = job_position;
        this.company_name = company_name;
        this.url_img = url_img;
        this.job_type = job_type;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.url = url;
    }

}
