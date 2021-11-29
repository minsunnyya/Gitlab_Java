package Chapter14.Lambda_Stream;

import java.util.stream.IntStream;

public class Ex14_0_Stream_md {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,50);
        intStream.filter(i->i%2==0).skip(4).limit(10).sorted().forEach(i->System.out.print(i+","));
    }
}
