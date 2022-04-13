package com.example.database_project2.service;

import com.example.database_project2.model.Student;
import com.example.database_project2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public String saveStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent.getFirst_Name()+" "+savedStudent.getLast_Name();
    }

    @Override
    public Student findById(int studentId) {

        Optional<Student> student = Optional.ofNullable(studentRepository.findById(studentId));
        if(student.isPresent()){
            return student.get();
        }else{
            return null;
        }
    }


}
