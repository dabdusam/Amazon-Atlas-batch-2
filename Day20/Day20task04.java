public class Day20task04 {
    public static void main(String[] args) {
        // Create an employee
        Employee emp = new Employee("Alice Johnson", "alice@example.com", 75000);

        // Create helper service instances
        ReportGenerator reportGenerator = new ReportGenerator();
        EmailService emailService = new EmailService();

        // Use the services
        reportGenerator.generatePdfReport(emp);
        emailService.sendEmail(emp);
    }
}

// 1. Employee class — only holds data
class Employee {
    private String name;
    private String email;
    private double salary;

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }
}

// 2. ReportGenerator class — responsible for report generation
class ReportGenerator {
    public void generatePdfReport(Employee emp) {
        // Simulated PDF generation logic
        System.out.println("Generating PDF Report...");
        System.out.println("Employee Report:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Salary: ₹" + emp.getSalary());
        System.out.println("PDF Report Generated Successfully.\n");
    }
}

// 3. EmailService class — responsible for sending emails
class EmailService {
    public void sendEmail(Employee emp) {
        // Simulated email sending logic
        System.out.println("Sending email to " + emp.getEmail());
        System.out.println("Subject: Salary Notification");
        System.out.println("Hello " + emp.getName() + ", your salary is ₹" + emp.getSalary() + ".");
        System.out.println("Email Sent Successfully.\n");
    }
}

