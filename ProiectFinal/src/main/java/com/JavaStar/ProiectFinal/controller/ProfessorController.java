package com.JavaStar.ProiectFinal.controller;

import com.JavaStar.ProiectFinal.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;
}
