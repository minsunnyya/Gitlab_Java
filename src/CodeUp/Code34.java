package CodeUp;

import java.util.Scanner;

public class Code34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("16진수 숫자를 입력해주세요>>");
        int a = sc.nextInt(16);//괄호안의 16이 16진수를의미
        System.out.printf("8진수로는 %o입니다.",a);
}
}
