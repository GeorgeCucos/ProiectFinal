package com.JavaStar.ProiectFinal.service;

import com.JavaStar.ProiectFinal.repository.CourseRepository;
import com.JavaStar.ProiectFinal.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
}
