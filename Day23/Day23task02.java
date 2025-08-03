// Product: Pizza (abstract class)
abstract class Pizza {
    // Template method to show order of steps
    public final void makePizza() {
        preparation();
        baking();
        cutting();
        boxing();
    }

    abstract void preparation();
    abstract void baking();
    abstract void cutting();
    abstract void boxing();
}

// ConcreteProduct: PepperoniPizza
class PepperoniPizza extends Pizza {

    @Override
    void preparation() {
        System.out.println("Preparing dough, adding tomato sauce, cheese, and pepperoni toppings.");
    }

    @Override
    void baking() {
        System.out.println("Baking Pepperoni Pizza at 220°C for 12 minutes.");
    }

    @Override
    void cutting() {
        System.out.println("Cutting Pepperoni Pizza into 8 slices.");
    }

    @Override
    void boxing() {
        System.out.println("Placing Pepperoni Pizza into the official pizza box.");
    }
}

// Creator: PizzaFactory (abstract)
abstract class PizzaFactory {
    // Factory method
    abstract Pizza createPizza();

    // Optional helper: client-facing method to get a ready pizza
    public Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.makePizza();
        return pizza;
    }
}

// ConcreteCreator: PepperoniPizzaFactory
class PepperoniPizzaFactory extends PizzaFactory {

    @Override
    Pizza createPizza() {
        // Could have additional setup logic here if needed
        return new PepperoniPizza();
    }
}

// Driver class
public class Day23task02 {
    public static void main(String[] args) {
        PizzaFactory pfobj = new PepperoniPizzaFactory();

        // Option 1: create pizza and manually call steps
        Pizza pobj = pfobj.createPizza();
        pobj.makePizza();

        System.out.println("---- OR using orderPizza() helper ----");

        // Option 2: use helper that encapsulates creation + making
        Pizza readyPizza = pfobj.orderPizza();
    }
}

