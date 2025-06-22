// WriteByte_1.java
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day11task03 {

    public static void main(String[] args) {

        // 1. Read a line of text from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to save in FileName02.txt: ");
        String s = sc.nextLine();          // entire line (including spaces)

        // 2. Convert that string into a byte array
        byte[] bytesToWrite = s.getBytes();  // uses platform default charset
//System.out.println(bytesToWrite[0]);
        // 3. Write the bytes to FileName02.txt
        try (FileOutputStream outfile =
                     new FileOutputStream("FileName02.txt")) {
            outfile.write(bytesToWrite);
//            outfile.write(s);
            System.out.println("Write Byte");
            System.out.println("Thank You...!!!");

        } catch (IOException e) {
            System.out.println("I/O error: " + e);
            System.exit(-1);
        }
    }
}


