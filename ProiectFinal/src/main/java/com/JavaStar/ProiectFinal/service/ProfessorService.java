package com.JavaStar.ProiectFinal.service;

import com.JavaStar.ProiectFinal.repository.CourseRepository;
import com.JavaStar.ProiectFinal.repository.PaymentRepository;
import com.JavaStar.ProiectFinal.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;
}
