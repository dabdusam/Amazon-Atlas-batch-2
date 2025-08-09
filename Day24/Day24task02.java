package com.example;

// Product
class Laptop {
    private int memory;
    private int storage;

    public Laptop() {
        // default constructor
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Laptop [Memory = " + memory + " GB, Storage = " + storage + " GB]";
    }
}

// Builder Interface
interface LaptopBuilder {
    LaptopBuilder buildMemory(int memory);
    LaptopBuilder buildStorage(int storage);
    Laptop build();
}

// Concrete Builder
class LaptopConcreteBuilder implements LaptopBuilder {
    private Laptop laptop;

    public LaptopConcreteBuilder() {
        this.laptop = new Laptop();
    }

    @Override
    public LaptopBuilder buildMemory(int memory) {
        laptop.setMemory(memory);
        return this;
    }

    @Override
    public LaptopBuilder buildStorage(int storage) {
        laptop.setStorage(storage);
        return this;
    }

    @Override
    public Laptop build() {
        return laptop;
    }
}

// Director (optional)
class LaptopDirector {
    private LaptopBuilder laptopBuilder;

    public LaptopDirector(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop constructLaptop(int memory, int storage) {
        return laptopBuilder
                .buildMemory(memory)
                .buildStorage(storage)
                .build();
    }
}

// Client
public class Day24task02 {
    public static void main(String[] args) {
        LaptopBuilder builder = new LaptopConcreteBuilder();
        LaptopDirector director = new LaptopDirector(builder);

        Laptop laptop = director.constructLaptop(16, 512);

        System.out.println(laptop);
    }
}

