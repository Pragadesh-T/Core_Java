package Core_Java.File_Handling;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderFile {
    public static void main(String[] args)throws IOException {
        readFile();
    }

    public static void readFile () throws IOException {
        // create object of FileReader a subclass of Reader class
        Reader reader = new FileReader("D:/Password_Based_Authentication/File_Handling/file.txt");
        // Read one character at a time from the file
        int data = reader.read();
        // convert the int to char and print
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        // close the Reader
        reader.close();
    }

}
