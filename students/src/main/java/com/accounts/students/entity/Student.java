package com.accounts.students.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;

    public Student(){
        this.firstname = "A";
        this.lastname = "B";
    }

    public Student(@JsonProperty("id") long id,
                   @JsonProperty("firstname") String firstname,
                   @JsonProperty("lastname") String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public long getId(){return id;}
    public void setId(long id){this.id = id;}

    public String getFirstname(){return firstname;}
    public void setFirstname(String firstname){this.firstname = firstname;}

    public String getLastname(){return lastname;}
    public void setLastname(String lastname){this.lastname = lastname;}
}
