package CodeUp;

import java.util.Scanner;
import java.io.IOException;

public class Code76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력>>");
        char a = sc.nextLine().charAt(0);//아스키코드 변환
        int b = (int) a;

        //A=65~

        for (int i = 97; i < b; i++) {
            System.out.println((char) i + "");


        }
    }
}
