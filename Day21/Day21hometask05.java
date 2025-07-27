import java.util.*;

// Superclass
class Animal1 {
    void sound() {
        System.out.println("Animal sound");
    }

    @Override
    public String toString() {
        return "Animal";
    }
}

// Subclass
class Cat1 extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat";
    }
}

public class Day21hometask05 {

    // Method using lower bounded wildcard to add a Cat
    static void addAcat(List<? super Cat> cats) {
        cats.add(new Cat());
    }

    public static void main(String[] args) {
        // List of Animal, which is a supertype of Cat
        List<Animal> animals = new ArrayList<>();

        // Add a Cat to the list using the lower bounded method
        addAcat(animals);

        // Print the list to confirm Cat was added
        for (Animal a : animals) {
            a.sound(); // Will output: Meow
        }
    }
}

