package workshop.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ExamsRecords {
    
    //members
    private int sumMath = 0;
    private int sumRead = 0;
    private int sumWrite = 0;
    private String hline = "";
    private String line = "";
    private int lineNum = 0;
    private String srcFile = "";

    public ExamsRecords() {

    }
    public ExamsRecords(String srcFile) {
        
        Reader r = new FileReader(srcFile);
        BufferedReader br = new BufferedReader(r);
    }



}
