package com.portfolioManagerAP.portfoliobackend.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class FinalUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String userName;
    private String email;
    private String password;
    private boolean isEnabled;

    public FinalUser() {
    }

    public FinalUser(String userName, String email, String password, boolean isEnabled) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.isEnabled = isEnabled;
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + userName + ", email=" + email + ", password=" + password + ", isEnabled=" + isEnabled + '}';
    }

}
