package com.accounts.students.service;

import com.accounts.students.entity.Course;
import com.accounts.students.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepo;

    public List<Course> getAllCourses(){return courseRepo.findAll();}

    public Course getCourseInfo(Long id){
        Course course = courseRepo.findById(id).get();
        return course;
    }

    public void addCourse(Course course){courseRepo.save(course);}

    public void updateCourse(long id, String courseCode){
        Course course = courseRepo.findById(id).get();
        course.setCourseCode(courseCode);
        courseRepo.save(course);
    }

}
