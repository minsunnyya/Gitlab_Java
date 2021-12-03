package CodeUp;

import java.util.Scanner;

public class Code85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요");
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        System.out.printf("%.2lf mb",(double)((a*b*c*d)/8));
    }
}
