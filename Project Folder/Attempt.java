package com.elearn.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

public class Attempt implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String quizId;
    private LocalDateTime time;
    private Map<Integer, Integer> answers = new HashMap<>();
    private int score;
    private int totalMarks;

    public Attempt(String username, String quizId) {
        this.username = username; this.quizId = quizId; this.time = LocalDateTime.now();
    }

    public void setAnswers(Map<Integer,Integer> answers) { this.answers = answers; }
    public void setScore(int s) { this.score = s; }
    public void setTotalMarks(int t) { this.totalMarks = t; }

    public String getUsername() { return username; }
    public String getQuizId() { return quizId; }
    public int getScore() { return score; }
    public int getTotalMarks() { return totalMarks; }

    @Override public String toString() {
        return "Attempt{user='"+username+"', quiz='"+quizId+"', score="+score+"/"+totalMarks+", at="+time+"}";
    }
}
