# E-Learning Platform with Auto Evaluation

A **Java-based console application** that simulates an online learning platform where **instructors** can create courses and quizzes, and **students** can enroll, attempt quizzes, and receive instant auto-evaluated results.

---

##  Features

### Instructor Features
- Create new courses  
- Add quizzes under each course  
- Add multiple-choice questions to quizzes  
- Automatically store data using serialization (no external DB setup required)

###  Student Features
- Register and log in securely  
- Enroll in available courses  
- Attempt quizzes with auto-evaluated scoring  
- View quiz results immediately after completion  

###  Core System Features
- File-based persistent storage (`elearn_data/`)  
- Console-based UI for simplicity and portability  
- Modular Java structure with clear separation of models and services  
- Extendable architecture (can be upgraded to Spring Boot or a GUI in future)  

---

## Project Structure
src/
 └── com/
      └── elearn/
           ├── Main.java
           ├── model/
           │    ├── User.java
           │    ├── Course.java
           │    ├── Quiz.java
           │    ├── Question.java
           │    └── Attempt.java
           └── service/
                ├── AuthService.java
                ├── CourseService.java
                ├── QuizService.java
                └── StorageService.java

---

##  Technology Stack

| Component             | Description                                   |
| --------------------- | --------------------------------------------- |
| **Java 17+**        | Core programming language                     |
| **OOP Principles** | Encapsulation, Inheritance, Polymorphism      |
| **Serialization**  | Persistent file-based data storage            |
| **Console UI**    | User interaction through text-based interface |

## Building and Running

### Prerequisites
-Java JDK 17 or higher
-IntelliJ IDEA (recommended) or any Java IDE

---

##  How to Run the Project

### Prerequisites
- Java 11 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code)
- Git installed (for version control)

  ---

## Open the Project

1. Open the project in IntelliJ IDEA (or any preferred IDE).
2.Right-click on the src folder → Mark Directory as → Sources Root.
3. Open and run Main.java.
4. Follow the console menu to register, log in, and explore features.

## Sample Console Menu
Welcome to E-Learning Platform (Console)
1) Register
2) Login
3) Exit
Choose:


## After login, instructors can:

-Create courses

-Add quizzes and questions

## Students can:

-Enroll in courses

-Take quizzes

## Example Quiz Flow

Q1: What is 2 + 2?
1) 3
2) 4
3) 5
4) 6
Your choice: 2
Score: 1/1


## How to Compile and Run (Manual Method)
# 1️. Compile the project
javac -d out $(find src -name "*.java")

# 2. Run the application
java -cp out com.elearn.Main

# Example Workflow

# 1️. Start the application
Welcome to E-Learning Platform 
1) Register
2) Login
3) Exit

# 2 Register as Instructor
Enter username: admin
Enter password: 1234
Enter role (student/instructor): instructor

# 3️. Create a Course
Course created: Java Basics (C1000)

# 4️. Add a Quiz & Questions
Quiz added: Introduction Quiz (Q5000)
Question: What is JVM?
Options:
1) Java Virtual Machine
2) Java Version Manager
3) Just Virtual Machine
4) None
Correct answer: 1

# 5. Student Login & Attempt
User: student1
Attempting quiz...
Q1: What is JVM?
Your choice (1-4): 1
Correct!
Score: 1/1

## Data Storage

All data is automatically saved in a folder named:

elearn_data/
 ├── auth.ser       # Stores registered users
 ├── courses.ser    # Stores created courses
 └── attempts.ser   # Stores quiz attempts and results

 ## Architecture Overview:

# 1. Design Patterns

1. Model–Service Structure: Separates data models from business logic.
2. Singleton Pattern: Used in StorageService for consistent data management.
3. Separation of Concerns: Independent modules for user, course, and quiz services.

# 2. Security and Data Handling

1. Input validation for all menu selections
2. Serialized data storage with controlled access
3. Modular service methods for future scalability

 ## Future Enhancements

1. Upgrade to a web-based interface using Spring Boot
2. Connect to MySQL/PostgreSQL for database persistence
3. Add student performance analytics and dashboards
4. Implement GUI using JavaFX
5. Integrate JWT-based authentication (for REST APIs)

## Contributing
1. Fork the repository
2. Create a new feature branch
3. Commit and push changes
4. Submit a pull request

## License

This project is created for learning and demonstration purposes.


