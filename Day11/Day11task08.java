import java.io.File;

public class Day11task08 {

    public static void main(String[] args) {

        // Check if exactly 2 arguments are provided: oldFileName newFileName
        if (args.length < 2) {
            System.out.println("Usage: java FileRenameDemo <oldFileName> <newFileName>");
            return;
        }

        File oldFile = new File(args[0]);
        File newFile = new File(args[1]);

        if (!oldFile.exists()) {
            System.out.println("File not found: " + oldFile.getName());
            return;
        }

        boolean success = oldFile.renameTo(newFile);

        if (success) {
            System.out.println("Renamed file " + oldFile.getName() + " to " + newFile.getName() + " successfully.");
        } else {
            System.out.println("Failed to rename file " + oldFile.getName());
        }
    }
}

