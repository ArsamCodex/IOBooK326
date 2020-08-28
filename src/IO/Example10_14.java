package IO;

public class Example10_14 {
    public static void main(String [ ] args)
    {

    }

    public static void writeData(String outputFile) throws FileNotFoundException {
        PrintWriter outFile = new PrintWriter(outputFile);
        String name;
        int stNo;
        double grade;
        System.out.println("ENTER STUDENT NAME\n");
        name = console.next();
        while(!name.trim().equals("stop")){
            System.out.println("\nENTER STUDENT NUMBER AND GRADE\n");
            stNo = console.nextInt();
            grade = console.nextDouble();
            outFile.write(name+ "");
            outFile.write(stNo);
            outFile.write(grade + "");
            System.out.println("\nENTER A NAME\n");
            name = console.next();
        }
        outFile.close();

    }
    public static void editData(String inputFile){

    }
    public static void printData(String File){}
    
}
