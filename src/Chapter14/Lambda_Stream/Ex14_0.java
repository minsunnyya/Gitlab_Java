package Chapter14.Lambda_Stream;

import java.util.function.Function;
import java.util.*;
import java.util.function.Supplier;

public class Ex14_0 {
    public static void main(String[] args) {


        //Function<Integer,int[]> f = i->new int[i]; //람다식
        Function<Integer, int[]> f = int[]::new;
        System.out.println(f.apply(4).length);//매서드 참조


    }
}

class MyClass{
    int iv;

    MyClass(int iv){//생성자
        this.iv=iv;
    }
}
