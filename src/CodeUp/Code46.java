package CodeUp;

import java.util.Scanner;

public class Code46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 세개를 입력하세요>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a+b+c);
        System.out.printf("%.2f",(float)(a+b+c)/3);
    }
}
