package com.example;

// Implementor
interface ExcalidrawAPI {
    void drawSquare(int s);
}

// Concrete Implementor 1
class DrawingFrame implements ExcalidrawAPI {
    @Override
    public void drawSquare(int s) {
        System.out.println("Drawing square in Drawing Frame using Excalidraw with side " + s);
    }
}

// Concrete Implementor 2
class DrawingPicture implements ExcalidrawAPI {
    @Override
    public void drawSquare(int s) {
        System.out.println("Drawing square in Drawing Picture using Excalidraw with side " + s);
    }
}

// Abstraction
abstract class Shape {
    protected ExcalidrawAPI excalidrawAPI;

    protected Shape(ExcalidrawAPI excalidrawAPI) {
        this.excalidrawAPI = excalidrawAPI;
    }

    abstract void draw();
}

// Refined Abstraction
class Square extends Shape {
    private int s;

    Square(int s, ExcalidrawAPI excalidrawAPI) {
        super(excalidrawAPI);
        this.s = s;
    }

    @Override
    void draw() {
        excalidrawAPI.drawSquare(s);
    }
}

// Main class
public class Day25task01 {
    public static void main(String[] args) {
        System.out.println("Bridge Method Design Pattern - Structural DP!");

        ExcalidrawAPI frameAPI = new DrawingFrame();
        ExcalidrawAPI pictureAPI = new DrawingPicture();

        Shape square1 = new Square(5, frameAPI);
        Shape square2 = new Square(8, pictureAPI);

        square1.draw();
        square2.draw();
    }
}

