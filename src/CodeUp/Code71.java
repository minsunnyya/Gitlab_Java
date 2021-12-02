package CodeUp;

import java.util.Scanner;

public class Code71 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("수를 입력하세요>>");
        String[] a = sc.nextLine().split("");
        sc.close();
        for (int i = 0; i <= a.length; i++) {
            int c = Integer.parseInt(a[i]);
            if(c==0) {
                break;
            }
                System.out.println(c);


        }
    }
    }
