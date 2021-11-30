package Chapter15_IO;


import java.io.*;

public class FileViewer {
    public static void main(String args[]) throws IOException {
        FileInputStream fis = new FileInputStream("src/Chapter15_IO/FileViewer.java");

        int data = 0;

        while((data= fis.read())!=-1){
            char c = (char) data;
            System.out.print(c);
        }

    }

}
