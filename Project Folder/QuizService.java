package com.elearn.service;

import com.elearn.model.*;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;

public class QuizService implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, List<Attempt>> attemptsByQuiz = new HashMap<>();

    public Attempt takeQuiz(String username, Quiz quiz, Scanner scanner) {
        Attempt attempt = new Attempt(username, quiz.getId());
        Map<Integer,Integer> answers = new HashMap<>();
        int score = 0;
        List<Question> qs = quiz.getQuestions();
        for (int i=0;i<qs.size();i++) {
            Question q = qs.get(i);
            System.out.println("\nQ" + (i+1) + ": " + q.getText());
            List<String> opts = q.getOptions();
            for (int j=0;j<opts.size();j++) System.out.println((j+1) + ") " + opts.get(j));
            System.out.print("Your choice (1-4): ");
            int choice = Integer.parseInt(scanner.nextLine().trim()) - 1;
            answers.put(i, choice);
            if (choice == q.getCorrectIndex()) score++;
        }
        attempt.setAnswers(answers);
        attempt.setScore(score);
        attempt.setTotalMarks(qs.size());
        return attempt;
    }

    public void recordAttempt(String courseId, String quizId, Attempt attempt) {
        attemptsByQuiz.computeIfAbsent(quizId, k -> new ArrayList<>()).add(attempt);
    }

    public List<Attempt> getAttemptsByUser(String username) {
        return attemptsByQuiz.values().stream()
                .flatMap(List::stream)
                .filter(a -> a.getUsername().equals(username))
                .collect(Collectors.toList());
    }

    public Map<String, List<Attempt>> internalAttempts() { return attemptsByQuiz; }
    public void setInternalAttempts(Map<String,List<Attempt>> m) { this.attemptsByQuiz = m; }
}

