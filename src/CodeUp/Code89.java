package CodeUp;

import java.util.Scanner;

public class Code89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*
         * 1+3=4
         * 4+3=7
         * 7+3=10
         * 10+3=13
         * */

        for (int i = a; i <=c; i++) {
            a+=b;
            System.out.println(a);
        }
    }
}
