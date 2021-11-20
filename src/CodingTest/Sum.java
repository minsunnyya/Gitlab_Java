package CodingTest;

class Solution00 {
    public long solution(int a, int b) {
        long answer = 0;

        for(int x = ((a < b)?a:b);x<=((a<b)?b:a);x++)
            answer+= x;

        return answer;
    }
}



/*풀이방법
1.x의 값을 구하기 위해 조건 연산자 사용
만약 a = 2이고 b가 4이가 참일때 x에 2저장 , x의 범위에 4 저장 해서
2+3+4더하게 만듬
*
* */