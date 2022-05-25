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
public class Education implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String school_name;
    private String title;
    private String career;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String url_img;
    private String edu_type;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String url;
    private String dateStart;
    private String dateEnd;
    private int score;

    public Education() {
    }

    public Education(String school_name, String title, String career, String url_img, String edu_type,
            String url, String dateStart, String dateEnd, int score) {
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
