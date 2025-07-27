public class Day20task01 {
    public static void main(String[] args) {
        // Create a Book instance
        Book book = new Book("The Alchemist", "Paulo Coelho", 500.0);

        // Create formatter and calculator instances
        BookFormatter formatter = new BookFormatter();
        BookPriceCalculator calculator = new BookPriceCalculator();

        // Use the classes
        System.out.println(formatter.getFormattedTitle(book));
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Original Price: ₹" + book.getPrice());
        System.out.println("Discounted Price (20% off): ₹" +
                calculator.calculateDiscountedPrice(book, 0.20));
    }
}

// Class to represent a Book (only stores data)
class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

// Class responsible for formatting book information
class BookFormatter {
    public String getFormattedTitle(Book book) {
        return "Title: " + book.getTitle().toUpperCase();
    }
}

// Class responsible for calculating book price logic
class BookPriceCalculator {
    public double calculateDiscountedPrice(Book book, double discountPercentage) {
        return book.getPrice() * (1 - discountPercentage);
    }
}


