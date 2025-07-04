import java.util.Scanner;

public class Day14task08 {
    static final int SIZE = 5;
    static int[] queue = new int[SIZE];
    static int front = 0;
    static int rear = -1;
    static int count = 0;

    // Check if queue is empty
    public static boolean isEmpty() {
        return count == 0;
    }

    // Check if queue is full
    public static boolean isFull() {
        return count == SIZE;
    }

    // Enqueue (insert)
    public static void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            rear++;
            queue[rear] = value;
            count++;
            System.out.println(value + " enqueued.");
        }
    }

    // Dequeue (remove)
    public static void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println(queue[front] + " dequeued.");
            front++;
            count--;
        }
    }

    // Peek front element
    public static void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
        } else {
            System.out.println("Element at front: " + queue[front]);
        }
    }

    // Display all elements
    public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Check if Full");
            System.out.println("6. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    value = sc.nextInt();
                    enqueue(value);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    System.out.println(isEmpty() ? "Queue is empty." : "Queue is not empty.");
                    break;
                case 5:
                    System.out.println(isFull() ? "Queue is full." : "Queue is not full.");
                    break;
                case 6:
                    display();
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}

