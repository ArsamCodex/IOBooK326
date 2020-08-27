package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Example10_9 {

    static Scanner console = new Scanner(System.in);

    public static void main(String [] args) throws IOException {
        String str;
        String filename = "file1.dat";
        byte [] buf;
        OutputStream outFile= new FileOutputStream(filename);
        System.out.println("ENTER A NAME ");
        str = console.nextLine();
        while(!str.trim().equals("stop")){
            buf = str.getBytes();
            outFile.write(buf);
            outFile.write('\n');
            System.out.println("ENTER NEXT STRING");
            str = console.nextLine();
        }

    }
}
