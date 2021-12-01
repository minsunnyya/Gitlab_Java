package CodeUp;

import java.util.Scanner;

public class Code28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 1개를 입력하세요 .단 범위는 0~4,294,967,295이다.>>");
       long a = sc.nextLong();
        System.out.printf("정수는 %d이다",a);
        System.out.println();
        System.out.println("정수로 맞게 됐는지 확인하기 위해 1더함"+">"+(int)(a+1));//형변환 해줘야 더하기로 값이 나옴, long일때만..?
    }
}
