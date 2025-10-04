package com.elearn.model;

import java.io.Serializable;
import java.util.*;

public class Question implements Serializable {
    private static final long serialVersionUID = 1L;
    private String text;
    private List<String> options;
    private int correctIndex;

    public Question(String text, List<String> options, int correctIndex) {
        this.text = text;
        this.options = new ArrayList<>(options);
        this.correctIndex = correctIndex;
    }

    public String getText() { return text; }
    public List<String> getOptions() { return options; }
    public int getCorrectIndex() { return correctIndex; }
}

