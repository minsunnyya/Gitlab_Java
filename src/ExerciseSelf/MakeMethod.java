package ExerciseSelf;

public class MakeMethod {
    public static void main(String[] args) {
        //객체 생성
    Cal c = new Cal();
    int result1 = c.add(100,200);
        System.out.println(result1);



    }

    static class Cal{//클래스 클래스 이름 선언
        int add( int a, int b){//반환타입 이름 매개변수
        int result = a + b;
        return result;
    }
    }
}
