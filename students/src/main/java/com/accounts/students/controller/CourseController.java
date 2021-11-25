package com.accounts.students.controller;

import com.accounts.students.entity.Course;
import com.accounts.students.service.CourseService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseImpl;

    @GetMapping("/all")
    public List<Course> getAllCourses(){return courseImpl.getAllCourses();}

    @GetMapping("/{id}")
    public Course getCourseInfo(@PathVariable("id") Long id){return courseImpl.getCourseInfo(id);}

    @PostMapping("/addCourse")
    public void addCourse(@Valid@NotNull@RequestBody Course course){courseImpl.addCourse(course);}

    @PutMapping("/updateCourse/{id}")
    public void updateCourse(@PathVariable("id") long id, @Valid@NotNull@RequestBody Course course){
        courseImpl.updateCourse(id, course.getCourseCode());
    }
}
