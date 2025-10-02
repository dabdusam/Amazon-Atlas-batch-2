package org.example;

// ToyService.java
public class ToyService {

    public String getToyName(int id) {
        // Simulate some logic
        switch (id) {
            case 1:
                return "Lego";
            case 2:
                return "Barbie";
            default:
                return getFallbackName();
        }
    }

    public String getFallbackName() {
        // Default fallback
        return "Unknown Toy";
    }
}

