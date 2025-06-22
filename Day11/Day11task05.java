// ReadChar.java
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day11task05 {

    public static void main(String[] args) {
        // Try‑with‑resources automatically closes the reader
        try (FileReader fr = new FileReader("FileName03.txt")) {

            int ch;
            while ((ch = fr.read()) != -1) {      // read() returns -1 at end of file
                System.out.print((char) ch);      // print each character
            }
            System.out.println("\nReading complete");

        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
