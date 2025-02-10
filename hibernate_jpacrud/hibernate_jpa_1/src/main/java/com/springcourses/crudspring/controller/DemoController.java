package com.springcourses.crudspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springcourses.crudspring.dao.StudentDAO;
import com.springcourses.crudspring.dao.StudentDAOImpl;
import com.springcourses.crudspring.entity.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {

    private StudentDAO studentDAO;

    @Autowired
    public DemoController(StudentDAO theStudentDAO) {
        this.studentDAO = theStudentDAO;
    }

    @GetMapping("/save")
    public String saveStudent() {
        Student student = new Student("Doe", "Mac", "JSena@gmail.com");
        System.out.println("Saved Student. Generated Id before: " + student.getId());
        studentDAO.save(student);
        System.out.println("Saved Student. Generated Id after: " + student.getId());
        return "Save Student Info !";
    }

    @GetMapping("/student")
    public String getStudent() {
        return studentDAO.findById(1).toString();
    }

    @GetMapping("/students")
    public String getStudents() {
        return studentDAO.getAllStudent().toString();
    }
    
    @GetMapping("/firstName")
    public String getFirstName() {
        return studentDAO.findByFirstName("John").toString();
    }

    @GetMapping("/update")
    public String updateStudent() {
        Student student = studentDAO.findById(1);
        System.out.println(student);
        student.setEmail("updated@Email.com");
        studentDAO.update(student);
        return "Update Success !";
    }

    @GetMapping("/delete")
    public String delete() {
        studentDAO.delete(2);
        return "Delete Success !";
    }
    
}
