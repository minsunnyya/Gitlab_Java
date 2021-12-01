package CodeUp;

import java.util.Scanner;

public class Code44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 한개를 입력하세요>>");
        int a = sc.nextInt();
        System.out.println("1을 더한 값은 " + ++a + "입니다.");
    }
}
