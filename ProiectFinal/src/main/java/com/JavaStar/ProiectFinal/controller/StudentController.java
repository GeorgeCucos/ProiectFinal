package com.JavaStar.ProiectFinal.controller;

import com.JavaStar.ProiectFinal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

}
