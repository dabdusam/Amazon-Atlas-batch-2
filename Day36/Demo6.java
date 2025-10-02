package org.example;

public class Demo6 {

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Optional main method to test manually
    public static void main(String[] args) {
        Demo6 demo = new Demo6();
        int[] numbers = {100, 200, 300, 400, 5000};

        for (int num : numbers) {
            System.out.println(num + " is even? " + demo.isEven(num));
        }
    }
}


