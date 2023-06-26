package com.JavaStar.ProiectFinal.entity;

import jakarta.persistence.*;

@Entity
public class TestCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long testCourseId;


    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public TestCourse() {
    }

    public TestCourse(Long testCourseId, Course course) {
        this.testCourseId = testCourseId;
        this.course = course;
    }

    public Long getTestCourseId() {
        return testCourseId;
    }

    public void setTestCourseId(Long testCourseId) {
        this.testCourseId = testCourseId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
