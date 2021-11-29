package Chapter14.Lambda_Stream;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex_14_0_Random {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints(1,46);//Random을 써줘야함
        intStream.distinct().limit(6).sorted().forEach(i-> System.out.print(i+","));

    }
}
