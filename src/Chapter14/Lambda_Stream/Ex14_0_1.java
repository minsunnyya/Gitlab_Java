package Chapter14.Lambda_Stream;//Stream예제

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_0_1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);
        Stream<Integer> intStream= list.stream();
        intStream.forEach(System.out::print);

        intStream= list.stream();
        intStream.forEach(System.out::print);
        intStream.forEach(System.out::print);
    }
}
