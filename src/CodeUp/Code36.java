package CodeUp;

import java.util.Scanner;

public class Code36 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("영문자를 입력해주세요.");
        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);//i열 문자 하나하나 읽어옴
            System.out.printf("아스키 코드의 값은 %d입니다.",(int)b);//b값이 문자기때문에 int로 형변환
            System.out.println();
        }
    }
}
