package com.example.database_project2.repository;

import com.example.database_project2.model.Student;
import org.springframework.data.repository.Repository;

import java.util.ArrayList;

public interface StudentRepository extends Repository<Student,Integer> {

Student save(Student student);

Student findById(int studentId);

}
