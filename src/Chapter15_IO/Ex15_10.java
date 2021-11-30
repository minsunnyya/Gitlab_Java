package Chapter15_IO;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Ex15_10 {
    public static void main(String[] args) {
        String inputData = "ABCD";
        StringReader input = new StringReader(inputData);
        StringWriter output = new StringWriter();

        int data = 0;

        try{
            while((data = input.read())!=-1){
                output.write(data);
            }
        }catch (IOException e){}
        System.out.println(inputData);
        System.out.println(output.toString());
    }
}
