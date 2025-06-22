// Main.java

@FunctionalInterface            // marks this as a functional interface
interface MyInterface {
    double getPiValue();        // single abstract method
}

public class Day11task09 {
    public static void main(String[] args) {

        // 1. Create a reference to MyInterface
        MyInterface ref;

        // 2. Assign a lambda expression that supplies π
        ref = () -> 3.1415;

        // 3. Call the method and print the result
        System.out.println("Pi ≈ " + ref.getPiValue());
    }
}

