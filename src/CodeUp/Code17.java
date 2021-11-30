package CodeUp;

import java.util.Scanner;

public class Code17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int a = sc.nextInt();
        //String b = Integer.toString(a);
        for (int i = 0; i < 3; i++) {
            System.out.print(a+" ");
        }

    }
}
