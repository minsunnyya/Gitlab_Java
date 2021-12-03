package CodeUp;

import java.util.Scanner;

public class Code81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1; i<=a;i++){
            for(int j=1; j<=b; j++)
                System.out.println(i+","+j);
        }

    }
}
