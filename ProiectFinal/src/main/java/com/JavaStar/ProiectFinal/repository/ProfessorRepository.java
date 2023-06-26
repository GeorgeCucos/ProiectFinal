package com.JavaStar.ProiectFinal.repository;

import com.JavaStar.ProiectFinal.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,Long> {
}
