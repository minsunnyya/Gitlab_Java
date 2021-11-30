package CodeUp;

import java.util.Scanner;

public class Code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("일의 자리 숫자 1개를 입력해주세요.>");
        int a = sc.nextInt();
        System.out.println("한번 더 입력해주세요.>");
        int b = sc.nextInt();

        System.out.printf("두 숫자는 차례대로%d %d입니다",b,a);

    }
}
