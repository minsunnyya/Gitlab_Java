package CodeUp;

import java.util.Scanner;

public class Code92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요>>");
        int a = sc.nextInt();//3
        int b = sc.nextInt();//7
        int c = sc.nextInt();//9

        int day=1;
        while (day%a!=0||day%b!=0||day%c!=0)day++;
        //3,7,9각각의 숫자가 day로 나눌수있으면 종료
        System.out.println(day);

        }


    }
