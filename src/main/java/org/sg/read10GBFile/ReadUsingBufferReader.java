package org.sg.read10GBFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadUsingBufferReader {

    public static final String Large_File = "/home/saurabh/Z_Development/Projects/CoreJava/src/main/java/org/sg/read10GBFile/largefile.txt";

    static void main() {
        try (BufferedReader reader = new BufferedReader(new FileReader(Large_File));) {
            String line;
            while((line = reader.readLine())!=null)
            {
                process(line);
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void process(String line) {
        System.out.println(line);
    }
}
