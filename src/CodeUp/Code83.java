package CodeUp;

import java.util.Scanner;

public class Code83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요");
        int a = sc.nextInt();
        for(int i =1;i<=a;i++){
           int b = 0;
            b += i;
            if(a%3==0){
                System.out.print("X");
            }else
                System.out.print(b);
        }
    }
}
