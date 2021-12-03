package CodeUp;

import java.util.Scanner;

public class Code80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요>>");
        int a = sc.nextInt();

        int sum = 0;
        for (int i=0; i<100; i++ ){
            sum +=i;
            if(a<=sum){
                System.out.println(i);
                break;
            }


        }
    }
}
