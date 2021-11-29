package Chapter14.Lambda_Stream;

import java.util.function.Function;
import java.util.*;

public class Ex14_0 {
    public static void main(String[] args) {
       //Function<String,Integer> f = (String s) -> Integer.parseInt(s);//입력도 있고 출력도 있으니까 function, 입력이 String출력이 Integer
        //메서드 참조로 만들어보기
        //Function<String,Integer> f = Integer::parseInt;
        Function<String,Integer> f = (String s)->Integer.parseInt(s);
        System.out.println(f.apply("100")+4);

    }
}
