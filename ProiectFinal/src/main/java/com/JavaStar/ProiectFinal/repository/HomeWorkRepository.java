package com.JavaStar.ProiectFinal.repository;

import com.JavaStar.ProiectFinal.entity.HomeWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkRepository extends JpaRepository<HomeWork,Long> {
}
