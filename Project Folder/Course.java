package com.elearn.model;


import java.io.Serializable;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;


public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    private String id;
    private String title;
    private String instructorUsername;
    private List<Quiz> quizzes = new ArrayList<>();
    private Set<String> enrolledStudents = new HashSet<>();


    public Course(String title, String instructorUsername) {
        this.id = "C" + ID_GENERATOR.getAndIncrement();
        this.title = title;
        this.instructorUsername = instructorUsername;
    }


    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getInstructorUsername() { return instructorUsername; }
    public List<Quiz> getQuizzes() { return quizzes; }
    public Set<String> getEnrolledStudents() { return enrolledStudents; }


    public void addQuiz(Quiz q) { quizzes.add(q); }
    public boolean enroll(String username) { return enrolledStudents.add(username); }


    @Override
    public String toString() {
        return "Course{" + id + ": '" + title + "', instructor='" + instructorUsername + "', quizzes=" + quizzes.size() + "}";
    }
}
