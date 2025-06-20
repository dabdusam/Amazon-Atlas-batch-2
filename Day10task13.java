class InterruptibleThread extends Thread {
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is running");
                Thread.sleep(100);
            }
            System.out.println("while loop ended");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}

public class Day10task13 {
    public static void main(String[] args) {
        InterruptibleThread thread = new InterruptibleThread();
        thread.start();

        try {
            Thread.sleep(500);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

