package com.as.project.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name="client")
    private String client;

    @Column(name="email_id")
    private String email;

    @Column(name = "date")
    private Date date;
    
}
