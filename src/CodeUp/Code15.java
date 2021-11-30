package CodeUp;

import java.util.Scanner;

public class Code15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("실수를 입력하세요>");
        float a = sc.nextFloat();
        System.out.printf("소숫점 이하 셋째까지 출력한 숫자는%.3f",a);
    }
}
