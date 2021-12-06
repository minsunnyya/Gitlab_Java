package CodeUp;

import java.util.Scanner;

public class Code91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요>>");
        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for(int i =a;i<n;i++){//1부터 8번째까지 반복
           a = (a*m)+d;

            System.out.println(a);
           // System.out.println(a);

        }


    }
}
