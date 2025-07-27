import java.util.*;

class Animals {
    void sound() {
        System.out.println("Sounds of different animals");
    }
}

class Cats extends Animal {
    @Override
    void sound() {
        System.out.println("Meow is the sound of cat");
    }
}

class Dogs extends Animal {
    @Override
    void sound() {
        System.out.println("Woof is the sound of dog");
    }
}

public class Day21hometask03 {

    // Method that accepts list of any type
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Example 1: List of Strings
        List<String> names = Arrays.asList("Akshay", "Babar", "Samad");
        System.out.println("Printing String list:");
        printList(names);

        System.out.println();

        // Example 2: List of Integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Printing Integer list:");
        printList(numbers);

        System.out.println();

        // Example 3: List of Animal objects
        List<Animal> animals = Arrays.asList(new Cat(), new Dog());
        System.out.println("Printing Animal list:");
        printList(animals);

        System.out.println();

        // Example 4: Polymorphism in action
        Animal obj = new Cat();
        obj.sound(); // "Meow is the sound of cat"
    }
}