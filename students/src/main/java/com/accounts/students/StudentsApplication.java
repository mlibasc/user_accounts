package com.accounts.students;

import com.accounts.students.entity.Course;
import com.accounts.students.entity.Student;
import com.accounts.students.repository.CourseRepository;
import com.accounts.students.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StudentsApplication {


	public static void main(String[] args) {
		//SpringApplication.run(StudentsApplication.class, args);

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(StudentsApplication.class, args);
		CourseRepository courseRepo = configurableApplicationContext.getBean(CourseRepository.class);
		StudentRepository studentRepo = configurableApplicationContext.getBean(StudentRepository.class);

		// Init students and courses
		Student student1 = new Student();
		Student student2 = new Student();
		student1.setFirstname("Jai");
		student1.setLastname("Pandey");
		student2.setFirstname("Lily");
		student2.setLastname("McGregor");

		Course math = new Course();
		Course science = new Course();
		Course art = new Course();
		Course music = new Course();
		math.setCourseCode("MAT101");
		science.setCourseCode("PHY101");
		art.setCourseCode("ART101");
		music.setCourseCode("MUS101");

		List<Student> students = Arrays.asList(student1, student2);
		studentRepo.saveAll(students);
		List<Course> courses = Arrays.asList(math, science, art, music);
		courseRepo.saveAll(courses);

	}
}
