package com.JavaStar.ProiectFinal.controller;

import com.JavaStar.ProiectFinal.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

}
