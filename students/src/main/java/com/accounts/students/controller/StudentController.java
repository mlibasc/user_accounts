package com.accounts.students.controller;

import com.accounts.students.entity.Student;
import com.accounts.students.service.StudentService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/school")
public class StudentController {
    @Autowired
    private StudentService studentImpl;

    @GetMapping("/students")
    public List<Student> getAllStudentInfo(){return studentImpl.getAllStudentInfo();}

    @GetMapping("student/{id}")
    public Student getStudentInfo(@PathVariable("id") long id){return studentImpl.getStudentInfo(id);}

    @PostMapping("/newStudent")
    public void addStudent(@Valid@NotNull@RequestBody Student student){studentImpl.addStudent(student);}

    @PutMapping("/modifyStudent/{id}")
    public void updateStudent(@PathVariable("id") long id, @Valid@NotNull@RequestBody Student student){
        studentImpl.updateStudent(id, student.getFirstname(), student.getLastname());
    }

}
