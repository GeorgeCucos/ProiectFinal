package com.JavaStar.ProiectFinal.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class HomeWork {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long homeWorkId;

    @ManyToMany(
            cascade =CascadeType.ALL
    )
    @JoinTable(
            name="student_homework_map",
            joinColumns = @JoinColumn(
                    name = "homework_id",
                    referencedColumnName = "homeworkId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name="student_id",
                    referencedColumnName = "studentId"
            )

    )
    private List<Student> students;
    private String description;
    private LocalDate limitDate;

    public HomeWork() {
    }

    public HomeWork(Long homeWorkId, List<Student> students, String description, LocalDate limitDate) {
        this.homeWorkId = homeWorkId;
        this.students = students;
        this.description = description;
        this.limitDate = limitDate;
    }

    public Long getHomeWorkId() {
        return homeWorkId;
    }

    public void setHomeWorkId(Long homeWorkId) {
        this.homeWorkId = homeWorkId;
    }

    public List<Student> getStudent() {
        return students;
    }

    public void setStudent(List<Student> students) {
        this.students = students;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(LocalDate limitDate) {
        this.limitDate = limitDate;
    }
}
