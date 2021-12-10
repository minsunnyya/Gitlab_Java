package CodeUp;

import java.util.Scanner;

public class Code95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] a = new int[b];//0으로 다 초기화 되어있음
        int c = 0;


        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
            c = a[0];

        }
        for (int i = 0; i < b; i++) {
            if (a[i] < c)
                c = a[i];

        }


        System.out.println(c);
    }//end main()

}