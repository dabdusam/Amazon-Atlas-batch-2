package com.elearn;

import com.elearn.model.*;
import com.elearn.service.*;

import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AuthService authService = new AuthService();
    private static final CourseService courseService = new CourseService();
    private static final QuizService quizService = new QuizService();

    public static void main(String[] args) {
        StorageService.getInstance().loadAll(authService, courseService, quizService);

        System.out.println("Welcome to E-Learning Platform (Console)");
        boolean running = true;
        while (running) {
            System.out.println("\n1) Register\n2) Login\n3) Exit");
            System.out.print("Choose: ");
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": register(); break;
                case "2": login(); break;
                case "3":
                    running = false;
                    StorageService.getInstance().saveAll(authService, courseService, quizService);
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void register() {
        System.out.print("Username: ");
        String u = scanner.nextLine();
        System.out.print("Password: ");
        String p = scanner.nextLine();
        System.out.print("Role (student/instructor): ");
        String r = scanner.nextLine();
        if (authService.register(u, p, r)) {
            System.out.println("Registered successfully.");
        } else {
            System.out.println("Registration failed (username exists or invalid role).");
        }
    }

    private static void login() {
        System.out.print("Username: ");
        String u = scanner.nextLine();
        System.out.print("Password: ");
        String p = scanner.nextLine();
        User user = authService.login(u, p);
        if (user == null) {
            System.out.println("Invalid credentials.");
            return;
        }
        if (user.isInstructor()) {
            instructorMenu(user);
        } else {
            studentMenu(user);
        }
    }

    private static void instructorMenu(User instructor) {
        boolean loop = true;
        while (loop) {
            System.out.println("\n--- Instructor Menu ---");
            System.out.println("1) Create Course");
            System.out.println("2) View My Courses");
            System.out.println("3) Add Quiz to Course");
            System.out.println("4) Logout");
            System.out.print("Choose: ");
            switch (scanner.nextLine()) {
                case "1":
                    System.out.print("Course title: ");
                    String t = scanner.nextLine();
                    Course c = courseService.createCourse(t, instructor.getUsername());
                    System.out.println("Created " + c);
                    break;
                case "2":
                    courseService.getAllCourses().stream()
                            .filter(cs -> cs.getInstructorUsername().equals(instructor.getUsername()))
                            .forEach(System.out::println);
                    break;
                case "3":
                    System.out.print("Enter course id: ");
                    String cid = scanner.nextLine();
                    Course crs = courseService.getCourseById(cid);
                    if (crs == null) {
                        System.out.println("Invalid course id.");
                        break;
                    }
                    System.out.print("Quiz title: ");
                    String qtitle = scanner.nextLine();
                    Quiz qz = new Quiz(qtitle);
                    crs.addQuiz(qz);
                    System.out.println("Quiz added.");
                    break;
                case "4":
                    loop = false;
                    break;
                default: System.out.println("Invalid choice.");
            }
        }
    }

    private static void studentMenu(User student) {
        boolean loop = true;
        while (loop) {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1) View All Courses");
            System.out.println("2) Enroll in Course");
            System.out.println("3) Take Quiz");
            System.out.println("4) View My Attempts");
            System.out.println("5) Logout");
            System.out.print("Choose: ");
            switch (scanner.nextLine()) {
                case "1":
                    courseService.getAllCourses().forEach(System.out::println);
                    break;
                case "2":
                    System.out.print("Enter course id: ");
                    String cid = scanner.nextLine();
                    if (courseService.enrollStudent(cid, student.getUsername())) {
                        System.out.println("Enrolled successfully.");
                    } else {
                        System.out.println("Enrollment failed.");
                    }
                    break;
                case "3":
                    System.out.print("Enter course id: ");
                    String ccid = scanner.nextLine();
                    Course crs = courseService.getCourseById(ccid);
                    if (crs == null) { System.out.println("Invalid course."); break; }
                    for (Quiz q : crs.getQuizzes()) {
                        System.out.println(q);
                    }
                    System.out.print("Enter quiz id: ");
                    String qid = scanner.nextLine();
                    Quiz qz = crs.getQuizzes().stream().filter(q -> q.getId().equals(qid)).findFirst().orElse(null);
                    if (qz == null) { System.out.println("Invalid quiz."); break; }
                    Attempt a = quizService.takeQuiz(student.getUsername(), qz, scanner);
                    quizService.recordAttempt(ccid, qid, a);
                    System.out.println("You scored " + a.getScore() + "/" + a.getTotalMarks());
                    break;
                case "4":
                    quizService.getAttemptsByUser(student.getUsername()).forEach(System.out::println);
                    break;
                case "5":
                    loop = false;
                    break;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
