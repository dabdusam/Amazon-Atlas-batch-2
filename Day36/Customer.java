package org.example;

public class Customer {
    private String fname;
    private String lname;

    public Customer(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getfname() {
        return fname;
    }

    public String getlname() {
        return lname;
    }

    @Override
    public String toString() {
        return "Customer{fname='" + fname + "', lname='" + lname + "'}";
    }

    public static void main(String[] args) {
        Customer customer = new Customer("John", "Abraham");
        System.out.println(customer);
    }
}



