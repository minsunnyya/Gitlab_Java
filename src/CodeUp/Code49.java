package CodeUp;

import java.util.Scanner;

public class Code49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 두개를 입력하세요>>");
        int a = sc.nextInt();
        int b = sc.nextInt();

//        if (a > b) {
//            System.out.println(0);
//        } else
//            System.out.println(1);

        System.out.println(a > b?0:1);//삼항 연산자
    }
}