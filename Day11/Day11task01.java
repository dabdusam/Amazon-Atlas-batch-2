// WriteByte.java
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day11task01 {

    public static void main(String[] args) {
        // 1. Prepare the file reference
        File f1 = new File("FileName01.txt");

        // 2. The text we want to store (as bytes)
        byte[] text = {'I', ' ', 'L', 'I', 'K', 'E', ' ', 'I', 'N', 'D', 'I', 'A'};

        // 3. Try‑with‑resources automatically closes the stream
        try (FileOutputStream outfile = new FileOutputStream(f1)) {
            outfile.write(text);                 // write the bytes
            System.out.println("Write Byte");   // console messages
            System.out.println("Thank You...!!!");
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
            System.exit(-1);
        }
    }
}


