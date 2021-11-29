package CodingTest;

import java.util.Scanner;

class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수를 입력하세요");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {

                System.out.print("*");

            }

            System.out.println();

        }
    }
    }
