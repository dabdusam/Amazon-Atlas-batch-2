package com.elearn.model;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// 👇 add this import to reference Question correctly
import com.elearn.model.Question;

public class Quiz implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final AtomicInteger ID_GEN = new AtomicInteger(5000);
    private String id;
    private String title;
    private List<Question> questions = new ArrayList<>();

    public Quiz(String title) {
        this.id = "Q" + ID_GEN.getAndIncrement();
        this.title = title;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public void addQuestion(Question q) { questions.add(q); }
    public List<Question> getQuestions() { return questions; }
    public int totalMarks() { return questions.size(); }

    @Override
    public String toString() {
        return "Quiz{" + id + ": '" + title + "', qns=" + questions.size() + "}";
    }
}


