package com.JavaStar.ProiectFinal.repository;

import com.JavaStar.ProiectFinal.entity.TestCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestCourseRepository extends JpaRepository<TestCourse,Long> {
}
