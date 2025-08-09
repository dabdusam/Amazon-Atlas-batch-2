package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Composite Design Pattern - Structural DP");

        Company softwareDepartment = new Software(1, "Software Development");
        Company hrDepartment = new HR(2, "Human Resources");

        CompanyHead companyHead = new CompanyHead(3, "ABC Company");
        companyHead.addDepartment(softwareDepartment);
        companyHead.addDepartment(hrDepartment);

        companyHead.displayName();
    }
}
