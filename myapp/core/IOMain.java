package myapp.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


// java IOMain <src> <dest>

public class IOMain {
    public static void main(String[] args) throws IOException {

        String srcFile = args[0];
        String dstFile = args[1];

        // 1K byte buffer
        byte[] buff = new byte[1024];
        int size = 0;

        // open file
        try {
            InputStream is = new FileInputStream(srcFile);
            System.out.println("File opened");

            OutputStream os = new FileOutputStream(dstFile);

            while (size >= 0) {
                size = is.read(buff);
                System.out.printf("read: %d\n" , size);
                if (size > 0) {
                    os.write(buff, 0, size);
                }
            }
            is.close();
            os.flush();
            os.close();
        } catch (FileNotFoundException ex) {
            //System.err.println(ex.getMessage());
            System.err.println("File open error, File not found");
        } catch (IOException ex) {
            System.err.printf("Close error");
        }
        
        


    }
}
