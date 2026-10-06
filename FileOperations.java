
import java.io.*;

public class FileOperations {
    public static void main(String[] args) throws IOException {

        // Opening the file for writing
        FileWriter writer = new FileWriter("sample.txt");

        // Writing into the file
        writer.write("Welcome to Java File Operations.\n");
        writer.write("This is an I/O Streams program.");

        // Closing the file
        writer.close();

        System.out.println("File written and closed successfully.");

        // Opening the file for reading
        FileReader reader = new FileReader("sample.txt");

        System.out.println("\nFile Contents:");

        // Reading the file
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        // Closing the file
        reader.close();

        System.out.println("\n\nFile read and closed successfully.");
    }
}
