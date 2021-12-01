package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Code38 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두개를 공백을 나눠서 입력하세요 예시)4 5 >>");
        String a = sc.nextLine();
        String[] b = a.split(" ");
        int[] nums = Arrays.stream(b).mapToInt(Integer::parseInt).toArray();//String[]을 int[]로 바꾸는 법
        //for(int i = 0; i<b.length;i++){
            System.out.println(nums[0]+nums[1]);

        }
    }

