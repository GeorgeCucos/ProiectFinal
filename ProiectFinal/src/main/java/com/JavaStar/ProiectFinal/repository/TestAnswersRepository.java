package com.JavaStar.ProiectFinal.repository;

import com.JavaStar.ProiectFinal.entity.TestAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestAnswersRepository extends JpaRepository<TestAnswers,Long> {
}
