package ExerciseSelf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Re_Ex15_14 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = null;
            FileOutputStream fos = null;

            fis = new FileInputStream("C:\\Users\\user\\Desktop\\Java\\java\\src\\ExerciseSelf\\Re_Ex15_14.java");
            fos = new FileOutputStream("C:\\Users\\user\\Desktop\\Java\\java\\phonebook.txt");

            int data = 0;
            while ((data=fis.read())!=-1){
                fos.write(data);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
