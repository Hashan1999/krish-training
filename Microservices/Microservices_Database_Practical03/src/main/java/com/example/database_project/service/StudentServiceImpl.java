package com.example.database_project.service;

import com.example.database_project.model.Student;
import com.example.database_project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String saveStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent.getFirst_Name()+" "+savedStudent.getLast_Name();
    }
}
