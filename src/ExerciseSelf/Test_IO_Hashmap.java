package ExerciseSelf;

import java.util.HashMap;
import java.util.Map;

public class Test_IO_Hashmap {
    public static void main(String[] args) {

        String[] arr = {"1,스티브리,01012341231",
                "2,스티브리,01012341232",
                "3,스티브리,01012341233",
                "4,스티브리,01012341234",
                "5,스티브리,01012341235",
                "6,스티브리,01012341236",
                "7,스티브리,01012341237",
                "8,스티브리,01012341238",
                "9,스티브리,01012341239",
                "10,스티브리,010123412310"};

        Map<String,String> value = new HashMap<>();
        value.put("key01",arr[0]);
        value.put("key02",arr[1]);
        value.put("key03",arr[2]);
        value.put("key04",arr[3]);
        value.put("key05",arr[4]);
        value.put("key06",arr[5]);
        value.put("key07",arr[6]);
        value.put("key08",arr[7]);
        value.put("key09",arr[8]);

        System.out.println(value);


    }
}
