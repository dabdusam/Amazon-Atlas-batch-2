
package org.example;

public class Demo1 {

    // Main method
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        String name = demo.getName();
        System.out.println("Name is: " + name);
    }

    // Method to be tested
    public String getName() {
        return "Samad";
    }
}



