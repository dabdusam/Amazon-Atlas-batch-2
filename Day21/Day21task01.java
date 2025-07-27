abstract class Bird {
        abstract void fly();
}

class Eagle extends Bird {
        @Override
        public void fly() {
                System.out.println("Eagle flies high.");
        }
}

class Ostrich extends Bird {
        @Override
        public void fly() {
                // This is a violation: Ostriches can't fly.
                System.out.println("Can't fly, but lays big eggs.");
        }
}

public class Day21task01 {
        public static void main(String[] args) {
                Bird eagle = new Eagle();
                Bird ostrich = new Ostrich();

                System.out.println("Testing Eagle:");
                eagle.fly(); // OK

                System.out.println("\nTesting Ostrich:");
                ostrich.fly(); // Misleading: Ostrich shouldn't fly
        }
}
