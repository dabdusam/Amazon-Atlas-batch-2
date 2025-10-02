package org.example;

public class Demo {

    // square method to be tested
    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println("Square of 10 is: " + demo.square(10));
    }
}


