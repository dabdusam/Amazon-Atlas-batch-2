import java.util.Scanner;

public class Day18task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (at least 5 digits): ");
        int number = scanner.nextInt();

        int place = 0;
        String[] places = {
                "Units digit is ",
                "Ones digit is ",
                "Hundreds digit is ",
                "Thousands digit is ",
                "10 Thousands digit is ",
                "Lakhs digit is ",
                "10 Lakhs digit is ",
                "Crores digit is ",
                "10 Crores digit is "
        };

        while (number > 0 && place < places.length) {
            int digit = number % 10;
            System.out.println(places[place] + digit);
            number = number / 10;
            place++;
        }

        scanner.close();
    }
}

