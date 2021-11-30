package CodeUp;

import java.util.Scanner;

public class Code20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("주민번호를 입력하세요");
        String a = sc.next();
        String[] b =a.split("-");
        System.out.printf("%s%s",b[0],b[1]);
    }}
