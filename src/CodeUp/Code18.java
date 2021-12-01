package CodeUp;

import java.util.Scanner;

public class Code18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시간을 입력하세요");
        int hour = sc.nextInt();
        System.out.println("분을 입력하세요");
        int min = sc.nextInt();
        System.out.printf("%d:%d",hour,min);

    }
}
