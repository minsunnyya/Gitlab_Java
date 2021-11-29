package Chapter14.Lambda_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_0_Arr {
    public static void main(String[] args) {

        Stream<String> strStream = Stream.of(new String[] {"a","b","c"});
        //=String[] strarr = new String[] {"a","b","c",d"}
        strStream.forEach(System.out::print);

       Integer[] intArr = {1,2,3,4,5};
       Stream<Integer> intStream = Arrays.stream(intArr);
       intStream.forEach(System.out::println);
        System.out.println(intStream.count());;
        System.out.println(intStream.distinct());
    }
}
