package IO;

import java.io.*;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Example10_5 {

    static Scanner in = new Scanner (System.in);

    public static  void main (String [] args) throws IOException {
        // SECOND MAIN IM GOIN TO GO AHED LIKE THIS ALL CLASSES HONA
        // BE HAVEE A MAIN CLASS WHEN IM FINISH IM EXMPLANING

        String filename = "Students.dat";
        PrintWriter outFile = new PrintWriter(filename);
        BufferedWriter writer = new BufferedWriter(outFile);
        String str ;
        System.out.print("ENTER NAME");
        str = in.nextLine();
        //  DO THIS LOOP TIL U GOT THIS CONDITION WHEN IT TYPE STOP DETERMINE PROGGY BUT ...
        while(!str.trim().equals("stop")){
            writer.write(str + "\n");
            System.out.print("ENTER II NAME");
            str = in.nextLine() ;

        }
        writer.flush();
        writer.close();

        // NOW HIIER I CAN II THINGS FOR YOU OF JUST AHED WHITH THE REST OF CODE
        // AND THAT IS TO PRINT THE INPUT OR
        // MAKE ANOTHER METHOD
        // OR MAKE  NEW CLASS I GO FOT FIRSST ONE

        // READ FILE BEGIN

        FileReader inFile  = new FileReader(filename);
        BufferedReader reader = new BufferedReader(inFile);

        System.out.println("\nREAS FROM FILE");
        str = reader.readLine();
        while (str != null){
            System.out.println(str);
            str= reader.readLine();
        }
        reader.close();
    }

    // ONE MORE THING THE TEXT CAN BE HASHED FOR SECUREUTY WHITH 2 KEYS PUBLIC PRIVATE
    //FOR THIS NEED A SEPERTE CLASS
    // I LIKE U TO UNDRESTAND THIS SUBJECT OF JAVA FILE INPUT OUTPUT IO ITS USEFULL
    //-

}
