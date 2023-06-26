package com.JavaStar.ProiectFinal.controller;

import com.JavaStar.ProiectFinal.service.TestQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestQuestionController {
    @Autowired
    private TestQuestionService testQuestionService;
}
