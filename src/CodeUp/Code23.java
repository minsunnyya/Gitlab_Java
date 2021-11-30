package CodeUp;

import java.util.Scanner;

public class Code23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("실수를 입력하세요.");
        String a = sc.nextLine();
        String[] b = a.split("\\.");
        for(int i = 0; i<b.length; i++)
        System.out.println(b[i]);


        System.out.println();
    }

}
