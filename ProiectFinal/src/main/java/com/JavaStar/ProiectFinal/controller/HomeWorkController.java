package com.JavaStar.ProiectFinal.controller;

import com.JavaStar.ProiectFinal.service.HomeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeWorkController {
    @Autowired
    private HomeWorkService homeWorkService;
}
