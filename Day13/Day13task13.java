import java.util.LinkedList;

public class Day13task13 {

    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Orange");
        fruits.addLast("Pineapple");

        System.out.println("Display using for loop with get():");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();

        System.out.println("Display using for-each loop:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}

