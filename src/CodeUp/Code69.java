package CodeUp;

import java.util.Scanner;

public class Code69 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요>>");
        int a = sc.nextInt();

        switch (a)
        {
            case 'A':
                System.out.println("best!!!!");
                break;
            case 'B':
                System.out.println("Good!!");
                break;
            case 'C':
                System.out.println("RUN!!!!");
                break;
            case 'D':
                System.out.println("Slowly~");
                break;
            default:
                System.out.println("What?");
                break;

        }

    }
}