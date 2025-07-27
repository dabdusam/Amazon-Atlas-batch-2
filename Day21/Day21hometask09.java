// Abstraction
interface SwitchOnOff {
    void turnOn();
    void turnOff();
}

// Low-level module: LightBulb implements the abstraction
class LightBulb implements SwitchOnOff {
    @Override
    public void turnOn() {
        System.out.println("Light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }
}

// High-level module: Switch depends on the interface, not a concrete class
class Switch {
    private SwitchOnOff device;

    public Switch(SwitchOnOff device) { // Constructor
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}

// Main class to run the program
public class Day21hometask09 {
    public static void main(String[] args) {
        SwitchOnOff lbulb = new LightBulb();      // Depends on abstraction
        Switch lightSwitch = new Switch(lbulb);   // Pass any device implementing SwitchOnOff
        lightSwitch.operate();                    // Output: Light turned on
    }
}

