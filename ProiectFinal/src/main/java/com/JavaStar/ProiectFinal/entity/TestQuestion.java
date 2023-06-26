package com.JavaStar.ProiectFinal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class TestQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long testQuestionId;
    private String text;
    private List<String> answers;
    private String correctAnswer;

    public TestQuestion() {
    }

    public TestQuestion(Long testQuestionId, String text, List<String> answers, String correctAnswer) {
        this.testQuestionId = testQuestionId;
        this.text = text;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public Long getTestQuestionId() {
        return testQuestionId;
    }

    public void setTestQuestionId(Long testQuestionId) {
        this.testQuestionId = testQuestionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
