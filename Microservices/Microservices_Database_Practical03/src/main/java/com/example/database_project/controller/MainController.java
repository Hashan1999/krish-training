package com.example.database_project.controller;

import com.example.database_project.model.Student;
import com.example.database_project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    String saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

}
