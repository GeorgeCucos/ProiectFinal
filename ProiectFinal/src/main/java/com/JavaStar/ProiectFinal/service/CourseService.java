package com.JavaStar.ProiectFinal.service;

import com.JavaStar.ProiectFinal.entity.Course;
import com.JavaStar.ProiectFinal.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService{
    @Autowired
    private CourseRepository courseRepository;
}
