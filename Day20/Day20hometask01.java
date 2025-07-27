import java.util.Scanner;

public class Day20hometask01 {
    String name;
    int rollNo;
    int[] marks = new int[3];  // for 3 subjects
    double totalMarks;
    double percentage;
    double fees;

    // Method 1: Registration Details
    public void registrationDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter fees paid: ");
        fees = sc.nextDouble();
    }

    // Method 2: Marks Calculation
    public void marksCalc() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 3 subjects (out of 100):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        percentage = (totalMarks / 300.0) * 100;
    }

    // Method 3: Fees Calculation
    public void feesCalc() {
        double totalFee = 50000;  // let's assume full course fee
        double due = totalFee - fees;

        System.out.println("\n--- Fees Details ---");
        System.out.println("Total Course Fee: ₹" + totalFee);
        System.out.println("Paid: ₹" + fees);
        System.out.println("Due: ₹" + due);
    }

    // Display Summary
    public void displayDetails() {
        System.out.println("\n--- Student Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks + "/300");
        System.out.printf("Percentage: %.2f%%\n", percentage);
    }

    // Main method
    public static void main(String[] args) {
        Day20hometask01 s = new Day20hometask01();
        s.registrationDetails();
        s.marksCalc();
        s.feesCalc();
        s.displayDetails();
    }
}

