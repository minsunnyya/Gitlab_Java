package Chapter14.Lambda_Stream;

import java.util.stream.Stream;

public class Ex14_0_Iterate {
    public static void main(String[] args) {

        Stream<Integer> strInt = Stream.iterate(0,n->n+1);
        strInt.limit(10).forEach(System.out::println);//limit안쓰면 무한 스트림 됨

        Stream<Integer> strgen = Stream.generate(()->1);
        strgen.limit(10).forEach(System.out::print);

    }
}
