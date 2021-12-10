package CodeUp;

import java.util.Scanner;

public class Code94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b [] = new int[23];

        for (int i =0; i<a; i++){
            int c =sc.nextInt();
            b[c-1]+=b[c]+1;
            System.out.println(b[c]);
        }
        System.out.println();
    }
}
