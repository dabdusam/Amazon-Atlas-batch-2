class LightBulbs {
    void turnOn() {
        System.out.println("Light turned on");
    }

    void turnOff() {
        System.out.println("Light is off");
    }
}

public class Day21hometask08 { // High-level module directly depends on low-level module
    LightBulb lbulbobj;

    Day21hometask08(LightBulb lbulbobj) {
        this.lbulbobj = lbulbobj;
    }

    void operate() {
        lbulbobj.turnOn();
    }

    public static void main(String[] args) {
        LightBulb lbulbobj = new LightBulb();           // ✅ Class name must start with uppercase
        Day21hometask08 switchobj = new Day21hometask08(lbulbobj);
        switchobj.operate();                            // Output: Light turned on
    }
}

