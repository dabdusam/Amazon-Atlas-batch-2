package com.elearn.service;

import com.elearn.model.Course;  // ✅ correct import
import java.io.Serializable;
import java.util.*;

public class CourseService implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, Course> courses = new LinkedHashMap<>(); // ✅ Map of Course

    public Course createCourse(String title, String instructorUsername) {
        Course c = new Course(title, instructorUsername); // ✅ create Course, not CourseService
        courses.put(c.getId(), c);
        return c;
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses.values());
    }

    public Course getCourseById(String id) {
        return courses.get(id);
    }

    public boolean enrollStudent(String courseId, String username) {
        Course c = courses.get(courseId);
        if (c == null) return false;
        return c.enroll(username);
    }

    public Map<String, Course> internalCourses() {
        return courses;
    }

    public void setInternalCourses(Map<String, Course> m) {
        this.courses = m;
    }
}
