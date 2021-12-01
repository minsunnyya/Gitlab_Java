package CodeUp;

import java.util.Scanner;

public class Code41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("영문자 하나를 입력하세요>>");
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            int b = a.charAt(i);
            System.out.println("그 다음 아스키 코드는" + (char)(b+1) + "입니다.");//같이 묶어야함
        }
    }
}