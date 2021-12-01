package ExerciseSelf;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try{
            String fileName = "PhoneBook.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);

            int data = 0;
            for(int i =0; i<10; i++) {
                while ((data = fis.read()) == -1) {
                    System.out.println((char) data);
                }
                System.out.println();
                fis.close();

                while ((data = fr.read()) != -1) {
                    System.out.println((char) data);
                }
                System.out.println();
                fr.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
