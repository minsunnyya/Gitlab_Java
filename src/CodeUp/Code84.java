package CodeUp;

import java.util.Scanner;

public class Code84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 0; k <= 1; k++) {
                    System.out.println(i + " " + j + " " + k);

                }

            }
        }System.out.println(a*b*c);

    }
}