// CreateAndMergeFiles.java
//
// 1. Creates NewFile01.txt and NewFile02.txt
// 2. Writes sample content into each
// 3. Merges them into NewFile03.txt
//
// Compile:  javac CreateAndMergeFiles.java
// Run:      java CreateAndMergeFiles

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Day11task07 {

    public static void main(String[] args) {

        String fileA  = "NewFile01.txt";
        String fileB  = "NewFile02.txt";
        String merged = "NewFile03.txt";

        // -----------------------------------------------------------------
        // STEP 1: Create the first two files and put some text in them
        // -----------------------------------------------------------------
        try (FileWriter fw1 = new FileWriter(fileA);
             FileWriter fw2 = new FileWriter(fileB)) {

            fw1.write("=== Content of first file ===\n");
            fw1.write("My name\nis\n");

            fw2.write("=== Content of second file ===\n");
            fw2.write("Abdul\nSamad\n");

            System.out.println("✓ Created " + fileA + " and " + fileB);

        } catch (IOException e) {
            System.out.println("I/O error while creating the source files: " + e.getMessage());
            return;   // abort if we can’t even create the input files
        }

        // -----------------------------------------------------------------
        // STEP 2: Merge the two files into the third one (byte‑by‑byte)
        // -----------------------------------------------------------------
        try (FileInputStream  in1   = new FileInputStream(fileA);
             FileInputStream  in2   = new FileInputStream(fileB);
             SequenceInputStream seq = new SequenceInputStream(in1, in2);
             BufferedInputStream  bin = new BufferedInputStream(seq);
             FileOutputStream   out   = new FileOutputStream(merged);
             BufferedOutputStream bout = new BufferedOutputStream(out)) {

            int ch;
            while ((ch = bin.read()) != -1) {   // read until end‑of‑stream
                bout.write(ch);
            }
            bout.flush();                       // push any remaining bytes
            System.out.println("✓ Merged into " + merged);

        } catch (IOException e) {
            System.out.println("I/O error during merge: " + e.getMessage());
        }
    }
}


