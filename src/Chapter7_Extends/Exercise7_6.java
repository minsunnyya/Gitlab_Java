package Chapter7_Extends;

class Outer{
    class Inner{
        int iv = 100;
    }
}

public class Exercise7_6 {
    public static void main(String[] args) {
        Outer o = new Outer();//외부클래스 인스턴스 생성
        Outer.Inner i = o.new Inner();//외부 클래스 안의 내부클래스 인스턴스 생성
        System.out.println(i.iv);
    }
}
