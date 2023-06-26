package com.JavaStar.ProiectFinal.service;

import com.JavaStar.ProiectFinal.repository.CourseRepository;
import com.JavaStar.ProiectFinal.repository.TestQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestQuestionService {
    @Autowired
    private TestQuestionRepository testQuestionRepository;
}
