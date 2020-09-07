package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example10_14 {
    static Scanner console = new Scanner(System.in);
    public static void main(String [ ] args) throws FileNotFoundException {
        String fileName = "seqfile.dat";
       writeData(fileName);
       editData(fileName);
       printData(fileName);


    }

    public static void writeData(String outputFile) throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter(outputFile);
        String name;
        int stNo;
        int grade;
        System.out.print("ENTER STUDENT NAME\n");
        name = console.next();
        while(!name.trim().equals("stop")){
            System.out.print("\nENTER STUDENT NUMBER \n"+ System.lineSeparator());
            stNo = console.nextInt();

            System.out.println("ENTER GRADE NU" );
            grade = console.nextInt();
            outFile.print(name+ " " + "\r\n");
            console.nextLine();
            outFile.print(stNo + "" + System.lineSeparator());
            System.out.println();
            outFile.print(grade + "" + System.lineSeparator());
            System.out.print("\nENTER A NAME\n");
            name = console.next();
        }
        outFile.close();

    }
    public static void editData(String inputFile) throws FileNotFoundException {

        //FIRST READ FILE WHICH ONE U WANT TO READ INSIDE
        Scanner inFile = new Scanner(new FileReader(inputFile));
        //II GIVE UP WHERE U WANT TO SAVE NEW FIILE
        PrintWriter outFile = new PrintWriter("hekp.dat");


        int searchStNo;
        int newGrade;
        String name ;
        int stNo;
        int grade;
        System.out.println("SERACH BY STUDENY NO");
        searchStNo = console.nextInt();
        System.out.println("ENTER NEW GRADE TO UPDATE");
        newGrade = console.nextInt();
        name = inFile.next();
        while(true){
            stNo = inFile.nextInt();
            grade = inFile.nextInt();
            if (stNo == searchStNo) {

                grade = newGrade;
            }
            outFile.print(name + " \n");
            outFile.print(stNo + "\n");
            outFile.print(grade + "\n");
            if(!inFile.hasNext())
                break;
            name = inFile.next();


        }
        outFile.close();
        inFile.close();

        File original = new File("seqfile.dat");
        File originlII = new File("hekp.dat");
        original.delete();
        originlII.renameTo(original);


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
