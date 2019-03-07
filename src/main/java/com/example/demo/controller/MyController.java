package com.example.demo.controller;

import com.example.demo.Entities.Student;
import com.example.demo.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    final StudentRepo studentRepo;

    @Autowired
    public MyController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @GetMapping("/")
    @ResponseStatus(value = HttpStatus.OK)
    public String myGet(@RequestParam String rocked) {
        Student student = new Student();
        student.setName(rocked);
        return studentRepo.save(student).toString();
    }

    @GetMapping("/find")
    @ResponseStatus(value = HttpStatus.OK)
    public String myGetTwo(@RequestParam String rocked) {
        Student student = studentRepo.getStudentsByPassportNumberNull();
        return "poop";
    }

}
