package CodeUp;

import java.util.Scanner;

public class Code29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("실수를 입력하세요.>>");
        double a = sc.nextDouble();
        System.out.printf("%.11f",a);//소숫점 자리수 지정
    }
}
