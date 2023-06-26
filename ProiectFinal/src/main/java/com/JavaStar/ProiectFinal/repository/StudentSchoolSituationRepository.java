package com.JavaStar.ProiectFinal.repository;

import com.JavaStar.ProiectFinal.entity.StudentSchoolSituation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentSchoolSituationRepository extends JpaRepository<StudentSchoolSituation,Long> {
}
