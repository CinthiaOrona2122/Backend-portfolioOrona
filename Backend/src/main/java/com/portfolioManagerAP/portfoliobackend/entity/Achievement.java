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
public class Achievement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Basic
    private String description;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String url;
    private String project_type;

    public Achievement() {
    }

    public Achievement(String name, String description, String url, String project_type) {
        this.name = name;
        this.description = description;
        this.url = url;
        this.project_type = project_type;
    }
    
    

    

}
