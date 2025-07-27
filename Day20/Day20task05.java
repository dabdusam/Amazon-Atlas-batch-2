public class Day20task05 {
    public static void main(String[] args) {
        Shape square1 = new Square(5);
        Shape square2 = new Square(7);

        Shape circle1 = new Circle(3);
        Shape circle2 = new Circle(4);

        AreaComparator comparator = new AreaComparator();

        System.out.println("Square Area Difference: " + comparator.compareArea(square1, square2));
        System.out.println("Circle Area Difference: " + comparator.compareArea(circle1, circle2));
    }
}

// Common interface for all shapes
interface Shape {
    double area();
}

// Square class implementing Shape
class Square implements Shape {
    private int height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * height;
    }
}

// Circle class implementing Shape
class Circle implements Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}

// Class to compare areas
class AreaComparator {
    public double compareArea(Shape a, Shape b) {
        return a.area() - b.area();
    }
}

