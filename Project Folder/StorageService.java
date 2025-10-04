package com.elearn.service;

import java.io.*;
import java.util.*;

public class StorageService {
    private static final StorageService INSTANCE = new StorageService();
    private final File dataDir = new File("elearn_data");

    private StorageService() { if (!dataDir.exists()) dataDir.mkdirs(); }
    public static StorageService getInstance() { return INSTANCE; }

    public void saveAll(AuthService auth, CourseService course, QuizService quiz) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(dataDir, "auth.ser")))) {
            out.writeObject(auth.internalUsers());
        } catch (Exception e) { System.err.println("Save auth failed: " + e.getMessage()); }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(dataDir, "courses.ser")))) {
            out.writeObject(course.internalCourses());
        } catch (Exception e) { System.err.println("Save courses failed: " + e.getMessage()); }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(dataDir, "attempts.ser")))) {
            out.writeObject(quiz.internalAttempts());
        } catch (Exception e) { System.err.println("Save attempts failed: " + e.getMessage()); }

        System.out.println("Data saved.");
    }

    @SuppressWarnings("unchecked")
    public void loadAll(AuthService auth, CourseService course, QuizService quiz) {
        File f1 = new File(dataDir, "auth.ser");
        if (f1.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f1))) {
                Map<String,Object> m = (Map<String,Object>) in.readObject();
                auth.setInternalUsers((Map) m);
            } catch (Exception e) { System.err.println("Load auth failed: " + e.getMessage()); }
        }

        File f2 = new File(dataDir, "courses.ser");
        if (f2.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f2))) {
                Map<String,Object> m = (Map<String,Object>) in.readObject();
                course.setInternalCourses((Map) m);
            } catch (Exception e) { System.err.println("Load courses failed: " + e.getMessage()); }
        }

        File f3 = new File(dataDir, "attempts.ser");
        if (f3.exists()) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(f3))) {
                Map<String,Object> m = (Map<String,Object>) in.readObject();
                quiz.setInternalAttempts((Map) m);
            } catch (Exception e) { System.err.println("Load attempts failed: " + e.getMessage()); }
        }
    }
}
