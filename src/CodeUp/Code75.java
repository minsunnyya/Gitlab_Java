package CodeUp;

import java.util.Scanner;

public class Code75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력>>");
        int a = sc.nextInt();
        String[] b =new String[a];
        /*i가 5일떄

          a[4]=5
        * a[3]=4
        * a[2]=3
        * a[1]=2
        * a[0]=1*/

        for (int i=b.length-1; i>=0;i--){//0<i<5
            System.out.println(i);


        }
    }
}
