package CodingTest;

//함수 solution은 정수 x와 자연수 n을 입력 받아,
// x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고,
// 조건을 만족하는 함수, solution을 완성해주세요.
//        x	n	answer
//        2	5	[2,4,6,8,10] 2씩 5번 answer[0] i<=n.length()
//        4	3	[4,8,12]     4씩 3번

class Up {
    public String solution(int x, int n) {
        long[] answer = new long[n];
        int y = 0;
        // String a = Integer.toString(n);
        for (int i = 0; i < n; i++) {//i=0,1,2,3,4,5 a=5
            y += x;//x=2 2+2=4, 4+2=6, 6+2=8, 8+2=10
            answer[i] = y;
            System.out.print(answer[i]);}

        System.out.println();

            return answer.toString();

        }

        public static void main (String[]args){
            Up value = new Up();
            System.out.println(value.solution(2, 5));
        }
    }
