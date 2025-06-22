// CopyByte.java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day11task06 {

    public static void main(String[] args) {

        // try‑with‑resources ensures both streams are closed automatically
        try (FileInputStream infile  = new FileInputStream("NewFile01.txt");
             FileOutputStream outfile = new FileOutputStream("NewFile05.txt")) {

            int byteRead;                     // stores the next byte or −1 (EOF)
            while ((byteRead = infile.read()) != -1) {
                outfile.write(byteRead);      // copy the byte to the output file
            }

            System.out.println("Byte copied from NewFile01.txt to NewFile05.txt");


        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}

