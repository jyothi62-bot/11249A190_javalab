
import java.io.*;

public class FileIOStream {
    public static void main(String[] args) throws IOException {

        // Output Stream - Writing to file
        FileOutputStream output = new FileOutputStream("sample.txt");

        String data = "Welcome to Java File I/O Streams.";

        output.write(data.getBytes());

        // Close output stream
        output.close();

        System.out.println("Data written successfully.");

        // Input Stream - Reading from file
        FileInputStream input = new FileInputStream("sample.txt");

        System.out.println("\nFile Contents:");

        int ch;
        while ((ch = input.read()) != -1) {
            System.out.print((char) ch);
        }

        // Close input stream
        input.close();

        System.out.println("\n\nFile closed successfully.");
    }
}

