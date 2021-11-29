package Chapter14.Lambda_Stream;

import java.util.function.Function;
import java.util.*;
import java.util.function.Supplier;

public class Ex14_0 {
    public static void main(String[] args) {
        //Supplier 입력없고 출력만 있음
       // Supplier<MyClass> s = ()->new MyClass();//클래스 이름이 MyClass
//        Supplier<MyClass> s = MyClass::new;
//        Function<Integer, MyClass> s = (i)-> new MyClass(i);
        Function<Integer, MyClass> s =MyClass::new;
//        Function<int , MyClass> s = MyClass::iv;//Myclass에 입력도 만들고 출력도 만듬  Function써야함
        MyClass mc = s.apply(100);
        System.out.println(mc.iv);
        //System.out.println(s.apply(100).iv);


    }
}

class MyClass{
    int iv;

    MyClass(int iv){//생성자
        this.iv=iv;
    }
}
