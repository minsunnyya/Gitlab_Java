package CodeUp;

import java.util.Scanner;

public class Code63 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("정수 세개를 입력하세요>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a<b?a:b)<c?(a<b?a:b):c);
    }
}