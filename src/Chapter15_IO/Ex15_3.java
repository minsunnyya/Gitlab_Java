package Chapter15_IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex15_3 {
    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        System.out.println(Arrays.toString(inSrc));

        try {
            while (input.available()>0){
                input.read(temp);
                output.write(temp);

                outSrc = output.toByteArray();
                printArrays(temp,outSrc);
            }
        }catch (IOException e){}
    }

    static void printArrays(byte[] temp, byte[] outsrc){
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(outsrc
        ));
    }
}
