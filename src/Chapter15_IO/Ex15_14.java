package Chapter15_IO;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex15_14 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try{
            fos = new FileOutputStream("phonebook.txt");

            ps = new PrintStream(fos);
            System.setOut(ps);
        }catch (IOException e){
            System.out.println("File not found");
        }
 =
        System.out.println("Hello by System.out");
        System.out.println("Hello by System.err");
    }
}
