package com.JavaStar.ProiectFinal.controller;

import com.JavaStar.ProiectFinal.service.TestAnswersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAnswersController {
    @Autowired
    private TestAnswersService testAnswersService;
}
