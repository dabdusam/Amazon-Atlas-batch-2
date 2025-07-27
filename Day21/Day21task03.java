// Interface that violates Interface Segregation Principle
interface ICalcShapesArea {
    void calcArea();
    void calcVolume();
}

// Circle has no volume but is forced to implement calcVolume()
class Circle implements ICalcShapesArea {
    @Override
    public void calcArea() {
        System.out.println("Calculating area of Circle: πr²");
    }

    @Override
    public void calcVolume() {
        // Dummy implementation
        System.out.println("Circle has no volume!");
    }
}

// Sphere has both area and volume
class Sphere implements ICalcShapesArea {
    @Override
    public void calcArea() {
        System.out.println("Calculating surface area of Sphere: 4πr²");
    }

    @Override
    public void calcVolume() {
        System.out.println("Calculating volume of Sphere: (4/3)πr³");
    }
}

// Driver class
public class Day21task03 {
    public static void main(String[] args) {
        ICalcShapesArea circle = new Circle();
        System.out.println("Circle:");
        circle.calcArea();
        circle.calcVolume(); // Not meaningful

        System.out.println();

        ICalcShapesArea sphere = new Sphere();
        System.out.println("Sphere:");
        sphere.calcArea();
        sphere.calcVolume();
    }
}

