package com.example.database_project2.controller;

import com.example.database_project2.model.Student;
import com.example.database_project2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class MainController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    String saveStudent(@RequestBody Student student) {

        return studentService.saveStudent(student);
    }



    @RequestMapping(value = ("/student"),method = RequestMethod.GET)
    ResponseEntity<Student> findById(@RequestParam int id){
        Student student = studentService.findById(id);
        if(student==null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok().body(student);
        }

    }

}
