package com.example;

// Prototype interface
interface Colors {
    Colors clone();
    String getName();
    void setName(String name);
}

// Concrete Prototype 1
class BlackConcretePrototype implements Colors {
    private String name;

    public BlackConcretePrototype() {
        System.out.println("BlackConcretePrototype constructor is called");
    }

    public BlackConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Colors clone() {
        return new BlackConcretePrototype(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

// Concrete Prototype 2
class WhiteConcretePrototype implements Colors {
    private String name;

    public WhiteConcretePrototype() {
        System.out.println("WhiteConcretePrototype constructor is called");
    }

    public WhiteConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Colors clone() {
        return new WhiteConcretePrototype(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

// Client Code
public class Day24task03 {
    public static void main(String[] args) {
        Colors blackPrototype = new BlackConcretePrototype("Black Color");
        Colors whitePrototype = new WhiteConcretePrototype("White Color");

        // Clone objects
        Colors clonedBlack = blackPrototype.clone();
        Colors clonedWhite = whitePrototype.clone();

        // Modify cloned objects
        clonedBlack.setName("Dark Color");
        clonedWhite.setName("Light Color");

        // Display results
        System.out.println("Black color is " + clonedBlack.getName());
        System.out.println("White color is " + clonedWhite.getName());
    }
}

