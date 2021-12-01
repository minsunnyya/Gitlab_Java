package CodeUp;

import java.util.Scanner;

public class Code32 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("10진수 숫자를 입력해주세요>>");
        int a = sc.nextInt();
        System.out.printf("16진수로는 %x입니다.",a);//16진수는 %x
    }
}
