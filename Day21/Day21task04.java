interface ICalcArea {
    void calcArea();
    void calcPerimeter();
}

interface ICalcVolume {
    void calcVolume();
}

class CircleShape implements ICalcArea {
    @Override
    public void calcArea() {
        System.out.println("Calculating area of Circle: πr²");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Calculating perimeter of Circle: 2πr");
    }
}

class SphereShape implements ICalcArea, ICalcVolume {
    @Override
    public void calcArea() {
        System.out.println("Calculating surface area of Sphere: 4πr²");
    }

    @Override
    public void calcPerimeter() {
        System.out.println("Sphere doesn't have a perimeter in 2D sense.");
    }

    @Override
    public void calcVolume() {
        System.out.println("Calculating volume of Sphere: (4/3)πr³");
    }
}

public class Day21task04 {
    public static void main(String[] args) {
        ICalcArea circle = new CircleShape();
        System.out.println("Circle:");
        circle.calcArea();
        circle.calcPerimeter();

        System.out.println();

        SphereShape sphere = new SphereShape();
        System.out.println("Sphere:");
        sphere.calcArea();
        sphere.calcPerimeter();
        sphere.calcVolume();
    }
}
