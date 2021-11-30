package CodeUp;

import java.util.Scanner;

public class Code19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("년도를 입력하세요.");
        int year = sc.nextInt();
        System.out.println("월을 입력하세요.");
        int month = sc.nextInt();
        System.out.println("일을 입력하세요.");
        int day = sc.nextInt();
        System.out.printf("%d.%d.%d",year,month,day);
    }
}
