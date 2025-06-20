import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Day10task08 {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }
}
