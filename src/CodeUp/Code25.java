package CodeUp;

import java.util.Scanner;

public class Code25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다섯 자리의 정수를 입력하세요 [예시]00000 >");
        char[] a = sc.nextLine().toCharArray();


        for ( int i = 0; i < a.length; i++){
           for(int j = (int) Math.pow(10,(4-i)); j<a.length; j++){
               System.out.println(a[i]);
        System.out.println(a[j]);

            System.out.println("["+a[i]*(a[j])+"]");
        }

//            System.out.println("["+a[4]*10000+"]");
//        System.out.println("["+a[3]*1000+"]");
//        System.out.println("["+a[2]*100+"]");
//        System.out.println("["+a[1]*10+"]");
//        System.out.println("["+a[0]+"]");
    }
}}
