package Chapter15_IO;

import java.io.*;


public class FileCopy {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/Chapter15_IO/FileCopy.java");
            FileOutputStream fos = new FileOutputStream("src/Chapter15_IO/FileViewer.java");

            int data = 0;
            while ((data=fis.read())!=-1)
                fos.write(data);
            fis.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
