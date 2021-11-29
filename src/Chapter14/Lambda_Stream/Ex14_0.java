package Chapter14.Lambda_Stream;

import java.util.function.Function;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Ex14_0 {
    public static void main(String[] args) {

        IntStream intStream = new Random().ints(1, 46);
        intStream.distinct().limit(6).sorted().forEach(i -> System.out.print(i + ","));
    }
}
