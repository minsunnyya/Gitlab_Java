package Chapter14.Lambda_Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {
    public static void main(String[] args) {
        Stream<String[]> strArrsrm = Stream.of(
                new String[]{"abc","def","jkl"},
                new String[]{"ABC","GHI","JKL"}
        );

        Stream<String> strStrm = strArrsrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        String[] lineArr = {
                "minsunkim hello how are you?",
                "what can i do for you?"
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))//하나이상의 공백
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}
