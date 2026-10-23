package ExceptionHandeling;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class throwsKeyword {

    static void readFile() throws IOException {
        FileReader file = new FileReader("data.txt");
        System.out.println("File Opened");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Could not find the file");
        }
    }

    /*
    Excp handling
    1. try - catch
    2. finally
    3. throw
    4. throws
    */
}