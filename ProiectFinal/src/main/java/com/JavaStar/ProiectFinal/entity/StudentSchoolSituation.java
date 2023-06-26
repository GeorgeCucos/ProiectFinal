package com.JavaStar.ProiectFinal.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StudentSchoolSituation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentSchoolSituationId;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;



    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private List<Integer> notes;

    public StudentSchoolSituation() {
    }

    public StudentSchoolSituation(Long studentSchoolSituationId, Student student, Course course, List<Integer> notes) {
        this.studentSchoolSituationId = studentSchoolSituationId;
        this.student = student;
        this.course = course;
        this.notes = notes;
    }

    public Long getStudentSchoolSituationId() {
        return studentSchoolSituationId;
    }

    public void setStudentSchoolSituationId(Long studentSchoolSituationId) {
        this.studentSchoolSituationId = studentSchoolSituationId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Integer> getNotes() {
        return notes;
    }

    public void setNotes(List<Integer> notes) {
        this.notes = notes;
    }
}
