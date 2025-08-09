package com.example;

// Product
class Mobile {
    String desc;

    public Mobile(String model) {
        this.desc = model;
    }

    public void getDesc() {
        System.out.println(this.desc);
    }
}

// Null Object for invalid models
class NoMobile extends Mobile {
    public NoMobile() {
        super("Sorry, invalid model");
    }
}

// Apple Factory
class Apple {
    private Apple() { }

    public static Mobile getMobile(String model) {
        if (model.equalsIgnoreCase("iphone16")) {
            return new Mobile("Here is your iPhone 16");
        } else if (model.equalsIgnoreCase("iphone16MaxPro")) {
            return new Mobile("Here is your iPhone 16 Max Pro");
        }
        return new NoMobile();
    }
}

// Samsung Factory
class Samsung {
    private Samsung() { }

    public static Mobile getMobile(String model) {
        if (model.equalsIgnoreCase("GalaxyS25")) {
            return new Mobile("Here is your Samsung Galaxy S25");
        } else if (model.equalsIgnoreCase("GalaxyZFlip7")) {
            return new Mobile("Here is your Samsung Galaxy Z Flip 7");
        }
        return new NoMobile();
    }
}

// OnePlus Factory
class OnePlus {
    private OnePlus() { }

    public static Mobile getMobile(String model) {
        if (model.equalsIgnoreCase("OnePlus13")) {
            return new Mobile("Here is your OnePlus 13");
        } else if (model.equalsIgnoreCase("OnePlus13Pro")) {
            return new Mobile("Here is your OnePlus 13 Pro");
        }
        return new NoMobile();
    }
}

// Super Factory
class MobileStore {
    private MobileStore() {
        System.out.println("Hello! Welcome to the world of Mobiles.");
    }

    public static Mobile getMobile(String brand, String model) {
        if (brand.equalsIgnoreCase("Apple")) {
            System.out.println("Here are your Apple Models:");
            return Apple.getMobile(model);
        } else if (brand.equalsIgnoreCase("Samsung")) {
            System.out.println("Here are your Samsung Models:");
            return Samsung.getMobile(model);
        } else if (brand.equalsIgnoreCase("OnePlus")) {
            System.out.println("Here are your OnePlus Models:");
            return OnePlus.getMobile(model);
        }
        return new NoMobile();
    }
}

// Client
public class Day24task01 {
    public static void main(String[] args) {
        Mobile m1 = MobileStore.getMobile("Apple", "iPhone16");
        m1.getDesc();

        Mobile m2 = MobileStore.getMobile("Samsung", "GalaxyS25");
        m2.getDesc();

        Mobile m3 = MobileStore.getMobile("OnePlus", "OnePlus13Pro");
        m3.getDesc();

        Mobile m4 = MobileStore.getMobile("Apple", "iPhone15"); // Invalid model
        m4.getDesc();
    }
}

