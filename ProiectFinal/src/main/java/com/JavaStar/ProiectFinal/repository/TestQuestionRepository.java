package com.JavaStar.ProiectFinal.repository;

import com.JavaStar.ProiectFinal.entity.TestQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestQuestionRepository extends JpaRepository<TestQuestion,Long> {
}
