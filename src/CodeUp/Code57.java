package CodeUp;

import java.util.Scanner;

public class Code57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 두개를 입력하세요>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a == 1 && b == 0 ? 0 : 1));
    }
}