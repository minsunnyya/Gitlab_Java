package CodeUp;

import java.util.Scanner;

public class Code45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 두개를 입력하세요>>");
        int a = sc.nextInt();
        float b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.printf("%.2f",a/b);
    }
}