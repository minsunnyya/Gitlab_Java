package CodeUp;

import java.util.Scanner;

public class Code68 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요>>");
        int a = sc.nextInt();

        if (90 <= a && a <= 100) {
            System.out.println("점수는 A입니다.");
        } else if (70 <= a && a <= 89) {
            System.out.println("점수는 B입니다.");
        } else if (40 <= a && a <= 69) {
            System.out.println("점수는 C입니다.");
        } else
            System.out.println("점수는 D입니다.");
    }
}
