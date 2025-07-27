// Abstract class for birds that can fly
abstract class BirdsThatFly {
    abstract void fly();
}

// Abstract class for birds that don't fly
abstract class BirdsThatDontFly {
    abstract void speciality();
}

// Renamed to avoid duplicate class name
class FlyingEagle extends BirdsThatFly {
    @Override
    public void fly() {
        System.out.println("Eagle flies high.");
    }
}

// Renamed to avoid duplicate class name
class NonFlyingOstrich extends BirdsThatDontFly {
    @Override
    public void speciality() {
        System.out.println("Ostrich can't fly, but lays big eggs.");
    }
}

public class Day21task02 {
    public static void main(String[] args) {
        BirdsThatFly eagle = new FlyingEagle();
        System.out.println("Testing Eagle:");
        eagle.fly();

        System.out.println();

        BirdsThatDontFly ostrich = new NonFlyingOstrich();
        System.out.println("Testing Ostrich:");
        ostrich.speciality();
    }
}

