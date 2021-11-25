package com.accounts.students.entity;

import javax.persistence.*;

@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="courseCode")
    private String courseCode;

    public Course(){
        this.courseCode = "temp";
    }

    public String getCourseCode(){return courseCode;}
    public void setCourseCode(String courseCode){this.courseCode = courseCode;}
}
