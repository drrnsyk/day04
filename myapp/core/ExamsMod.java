package myapp.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ExamsMod {
    // java ReaderMain text_file

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String srcFile = args[0];
        Reader r = new FileReader(srcFile);
        BufferedReader br = new BufferedReader(r);

        String hline = "";
        String line = "";
        int lineNum = 0;

        int sumMath = 0;
        int sumRead = 0;
        int sumWrite = 0;

        // read the headers store in a header string array
        hline = br.readLine();
        String[] headerLine = hline.split(",");
        
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            String[] bodyLine = line.split(",");

            if (bodyLine[1].substring(1, bodyLine[1].length()-1).equals("group A")) {
                sumMath += Integer.parseInt(bodyLine[5].substring(1, bodyLine[5].length()-1));
                sumRead += Integer.parseInt(bodyLine[6].substring(1, bodyLine[6].length()-1));
                sumWrite += Integer.parseInt(bodyLine[7].substring(1, bodyLine[7].length()-1));
                lineNum++;
            }            
        } 
            
        // for checking
        System.out.printf("The following are the headers of the file: ");
        System.out.println();
         for (int i = 0; i < headerLine.length; i++) {
              System.out.println(headerLine[i]);
        }
        System.out.println();
        System.out.printf("The following are the calculations of the file: ");
        System.out.println();
        System.out.printf("The total number of lines: %d", lineNum);
        System.out.println();
        System.out.printf("The total sum of math score is: %d\n", sumMath);
        System.out.printf("The total sum of reading score is: %d\n", sumRead);
        System.out.printf("The total sum of writing score is: %d\n", sumWrite);
        System.out.println();
        System.out.printf("The average math score is: %d\n", sumMath/lineNum);
        System.out.printf("The average reading score is: %d\n", sumRead/lineNum);
        System.out.printf("The average writing score is: %d\n", sumWrite/lineNum);

        r.close();
        
    }


}
