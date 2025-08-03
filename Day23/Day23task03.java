// SingletonDemo.java
class SingletonDemo {
    // volatile ensures visibility of changes across threads
    private static volatile SingletonDemo instance;

    // private constructor prevents external instantiation
    private SingletonDemo() {
        System.out.println("Initiating the singleton");
    }

    // lazy, thread-safe getter with double-checked locking
    public static SingletonDemo getInstance() {
        if (instance == null) { // first check (no locking)
            synchronized (SingletonDemo.class) {
                if (instance == null) { // second check (with lock)
                    instance = new SingletonDemo();
                    System.out.println("In getInstance(): created instance");
                }
            }
        }
        return instance;
    }

    // example instance method
    public void doHere() {
        System.out.println("Doing something inside singleton");
    }
}

// SingletonDP.java
public class Day23task03 {
    public static void main(String[] args) {
        // Proper usage: get the singleton and call its method
        SingletonDemo.getInstance().doHere();

        // Further calls reuse the same instance
        SingletonDemo.getInstance().doHere();

        // The following would be illegal because constructor is private:
        // SingletonDemo obj = new SingletonDemo(); // compile error
    }
}

