package org.sg.read10GBFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChunkReader {

    public static final String Large_File = "/home/saurabh/Z_Development/Projects/CoreJava/src/main/java/org/sg/read10GBFile/largefile.txt";

    static void main() {
        try (FileInputStream fileInputStream = new FileInputStream(Large_File);)
        {

            byte[] chuck = new byte[8196];//8KB
            int byteRead;

            while((byteRead = fileInputStream.read(chuck))!=-1){
                processChunk(chuck, byteRead);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void processChunk(byte[] chuck, int byteRead) {
        System.out.println(new String(chuck, 0, byteRead));
    }
}
