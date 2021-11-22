package com.accounts.students.service;

import com.accounts.students.entity.Student;
import com.accounts.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudentInfo(){return studentRepo.findAll();}

    public Student getStudentInfo(Long id){
        Student student = studentRepo.findById(id).get();
        return student;
    }

    public void addStudent(Student student){ studentRepo.save(student);}

    public void updateStudent(long id, String firstname, String lastname){
        Student student = studentRepo.findById(id).get();
        if(firstname != null){
            student.setFirstname(firstname);
        }
        if(lastname != null){
            student.setLastname(lastname);
        }
        studentRepo.save(student);
    }
}
