// Day11task04.java
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Day11task04 {

    public static void main(String[] args) {
        File f1 = new File("FileName03.txt");
        FileWriter fw = null;

        try {
            fw = new FileWriter(f1);
            fw.write("ahmedabad\n");
            fw.write("baroda\n");
            fw.close();                       // always close when done
            System.out.println("Write operation done!!");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry..!! File Not Found...!!!");
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}


