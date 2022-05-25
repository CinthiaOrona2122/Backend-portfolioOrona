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
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String lastname;
    @Basic
    private Long cuit;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String url_img;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "text")
    private String interest;
    private String birthday;
    private String location;

    public Person() {
    }

    public Person(String name, String lastname, Long cuit, String url_img, String interest, String birthday, String location) {
        this.name = name;
        this.lastname = lastname;
        this.cuit = cuit;
        this.url_img = url_img;
        this.interest = interest;
        this.birthday = birthday;
        this.location = location;
    }

    

}
