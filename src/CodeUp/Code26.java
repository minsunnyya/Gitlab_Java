package CodeUp;

import java.util.Scanner;

public class Code26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시 분 초를 입력해주세요. 예시) 2:30:11 >");
        String a = sc.nextLine();
        String[] b = a.split(":");
        System.out.println(b[1]);
    }
}
