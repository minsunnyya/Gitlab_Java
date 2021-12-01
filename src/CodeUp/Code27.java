package CodeUp;

import java.util.Scanner;

public class Code27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("년월일을 입력하세요 예시)2018.2.3>");
        String a = sc.next();
        String[] b = a.split("\\.");
//        //for (int i = 0; i < b.length; i++) {
//            System.out.print(b[2]+"-");
//            System.out.print(b[1]+"-");
//            System.out.print(b[0]);

        String year =b[0];
        String mon =b[1];
        String day =b[2];

        System.out.printf("%s-%s-%s",b[2],b[1],b[0]);


        }
    }
