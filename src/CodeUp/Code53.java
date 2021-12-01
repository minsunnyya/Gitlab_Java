package CodeUp;

import java.util.Scanner;

public class Code53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 두개를 입력하세요>>");
        int a = sc.nextInt();

        System.out.println((!(a ==1) ?1:0));
    }
}
