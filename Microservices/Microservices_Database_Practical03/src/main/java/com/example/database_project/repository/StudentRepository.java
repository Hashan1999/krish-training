package com.example.database_project.repository;

import com.example.database_project.model.Student;
import org.springframework.data.repository.Repository;

public interface StudentRepository extends Repository<Student,Integer> {

Student save(Student student);

}
