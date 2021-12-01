package CodeUp;

import java.util.Scanner;

public class Code31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("10진수 숫자를 입력해주세요>>");
        int a = sc.nextInt();
        System.out.printf("8진수로는 %o입니다.",a);//8진수는 %o
    }
}
