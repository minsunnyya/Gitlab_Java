package CodeUp;

import java.util.Scanner;

public class Code79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자를 입력하세요");
        String[] a= sc.nextLine().split("");
        for(int i =0; i<a.length;i++){
            String b = a[i];
            if(b.equals("q")) {
                //쌍따옴표로 표시
                break;
            }
            System.out.println(a[i]);

        }
    }

}


