package com.JavaStar.ProiectFinal.controller;

import com.JavaStar.ProiectFinal.service.TestCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCourseController {
    @Autowired
    private TestCourseService testCourseService;
}
