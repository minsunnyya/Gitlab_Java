package CodeUp;

import java.util.Scanner;

public class Code33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("8진수 숫자를 입력해주세요>>");
        int a = sc.nextInt(8);//괄호안의 8이 8진수를의미
        System.out.printf("10진수로는 %d입니다.",a);
    }
}
