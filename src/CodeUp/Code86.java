package CodeUp;

import java.util.Scanner;

public class Code86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            if(i%3!=0){
                System.out.println(i);
            }
        }
    }
}
