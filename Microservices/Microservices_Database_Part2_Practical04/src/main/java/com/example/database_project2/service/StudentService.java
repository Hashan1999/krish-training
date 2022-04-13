package com.example.database_project2.service;

import com.example.database_project2.model.Student;

import java.util.ArrayList;

public interface StudentService {
   String saveStudent(Student student);

   Student findById(int studentId);
}
