package CodeUp;

import java.util.Scanner;

public class Code24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단어를 하나 입력해주세요>");
        char[] a = sc.next().toCharArray();//문자열을 하나씩 쪼개줌
        for(int i = 0; i<a.length; i++)
            System.out.println("\'"+a[i]+"\'");

    }
}
