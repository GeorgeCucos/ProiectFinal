package com.JavaStar.ProiectFinal.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TestAnswers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long testAnswersId;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "test_course_id")
    private TestCourse testCourse;
    private List<String> answers;

    public TestAnswers() {
    }

    public TestAnswers(Long testAnswersId, Student  student, TestCourse testCourse, List<String> answers) {
        this.testAnswersId = testAnswersId;
        this.student = student;
        this.testCourse = testCourse;
        this.answers = answers;
    }

    public Long getTestAnswersId() {
        return testAnswersId;
    }

    public void setTestAnswersId(Long testAnswersId) {
        this.testAnswersId = testAnswersId;
    }

    public Student  getStudent() {
        return student;
    }

    public void setStudent(Student  student) {
        this.student = student;
    }

    public TestCourse getTestCourse() {
        return testCourse;
    }

    public void setTestCourse(TestCourse testCourse) {
        this.testCourse = testCourse;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
