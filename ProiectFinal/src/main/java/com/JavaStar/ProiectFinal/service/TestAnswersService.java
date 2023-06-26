package com.JavaStar.ProiectFinal.service;

import com.JavaStar.ProiectFinal.repository.CourseRepository;
import com.JavaStar.ProiectFinal.repository.TestAnswersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestAnswersService {
    @Autowired
    private TestAnswersRepository testAnswersRepository;
}
