package IO;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // READ KEYBOARD EN WRITE TO A FILE EN BACK READ IN A LOOP
        String filename = "nameST.dat";

         saveData(filename);
         printFile(filename);

    }

    public static void saveData(String filename) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(filename);
        String str;
        double grade;
        System.out.println("ENTER NAME ");
        str = console.next();
        while (!str.trim().equals("Stop")) {

            outFile.print(str + "");
            System.out.print("ENTER GRADE\n");
            grade = console.nextDouble();
            outFile.print(grade);
            outFile.print(" ");
            System.out.print("ENTER NAME\n");
            str = console.next();

        }
        outFile.close();

    }

    public static void printFile(String filename) {
        try {
            Scanner inFile = new Scanner(new FileReader(filename));
            while (inFile.hasNext())
                System.out.println(inFile.nextLine());
//            String str;
//            double grade;
//            System.out.println("\nREAD FROM FILE \n");
//            str = inFile.next();
//            while (inFile.hasNext()) {
//                grade = inFile.nextDouble();
//                str = inFile.next();
//                System.out.printf("%s : %5.2f", str, grade);
//                System.out.println();
//               // str = inFile.next();
//            }
            //           inFile.close();
//
//        } catch (Exception e) {
//            if (e.getMessage() != null) {
//                System.out.print(e.getMessage());
//            }
//        }
//    }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}