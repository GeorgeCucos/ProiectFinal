package com.JavaStar.ProiectFinal.controller;

import com.JavaStar.ProiectFinal.service.StudentSchoolSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentSchoolSituationController {
    @Autowired
    private StudentSchoolSituationService studentSchoolSituationService;
}
