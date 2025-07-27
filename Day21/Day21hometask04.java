import java.util.*;

// Base class
class Animals {
    void sound() {
        System.out.println("Sounds of different animals");
    }
}

// Subclass Cat
class Cats extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

// Subclass Dog (optional extra example)
class Dogs extends Animal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

public class Day21hometask04 {

    // Method using upper bounded wildcard
    static void animalSound(List<? extends Animal> animalList) {
        for (Animal element : animalList) {
            element.sound();
        }
    }

    public static void main(String[] args) {
        // Create a list of cats
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        // Create a list of dogs (optional)
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        // Call method with List<Cat>
        System.out.println("Cat sounds:");
        animalSound(cats);  // Output: Meow

        // Call method with List<Dog>
        System.out.println("Dog sounds:");
        animalSound(dogs);  // Output: Woof
    }
}

