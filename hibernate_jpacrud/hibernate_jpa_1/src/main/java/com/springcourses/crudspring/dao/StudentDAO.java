package com.springcourses.crudspring.dao;

import java.util.List;

import com.springcourses.crudspring.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
    List<Student> getAllStudent();
    List<Student> findByFirstName(String firstName);
    void update(Student theStudent);
    void delete(Integer id);
}
