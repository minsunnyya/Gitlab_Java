package CodeUp;

import java.util.Scanner;

public class Code93 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int[] a = new int[b];//0으로 다 초기화 되어있음

        for (int i = 0; i <b; i++) {//1234
            int num = sc.nextInt();//계속 반복 되면서 값 치게끔함
            a[i]=num;



        }
        for (int i = a.length-1; i >= 0; i--){
            System.out.println(a[i]);
        }
    }//end main()
}