package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example10_14 {
    static Scanner console = new Scanner(System.in);
    public static void main(String [ ] args) throws FileNotFoundException {
        String fileName = "seqfile.dat";
       writeData(fileName);
       // printData(fileName);

    }
    
    //WRITE DATA METHOD WRITES INPUT NOT LINE BY LINE BUT APPENDED . A BUG 
    //System.lineseperator() -> STATIC METHOD BY DEFUALT OR "\r\n" SAME  

    public static void writeData(String outputFile) throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter(outputFile);
        String name;
        int stNo;
        int grade;
        System.out.print("ENTER STUDENT NAME\n");
        name = console.next();
        while(!name.trim().equals("stop")){
            System.out.print("\nENTER STUDENT NUMBER \n");
            stNo = console.nextInt();
            System.out.println("ENTER GRADE NU");
            grade = console.nextInt();
            outFile.write(name+ "");//PROGRAM CRASHED HIER AND NEXT SECOND LINE
            outFile.write(stNo);
            outFile.write(grade + "");
            System.out.print("\nENTER A NAME\n");
            name = console.next();
        }
        outFile.close();

    }
    public static void editData(String inputFile){
        

    }
    public static void printData(String file) throws FileNotFoundException {
        String name ;
        int stNo;
        int grade;
        Scanner inFile = new Scanner (new FileReader(file));
        while(true){
            if(inFile.hasNext()){
                name = inFile.next();
                stNo = inFile.nextInt();
                grade = inFile.nextInt();
                System.out.println(name + "   " + stNo + "   " + grade);
            }
            else
                break;
        }
        System.out.println("END FILE CLOSING ...");
        inFile.close();;    }

}
