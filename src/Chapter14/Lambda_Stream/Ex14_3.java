package Chapter14.Lambda_Stream;

import java.util.function.Predicate;

public class Ex14_3 {
    public static void main(String[] args) {
        Predicate<Integer>  p = i -> i< 100;
        Predicate<Integer>  q = i -> i <200;
        Predicate<Integer>  r = i -> i%2 ==0;
        Predicate<Integer>  notp = p.negate();//i는 100보다 크다 i>100

        Predicate<Integer> all =notp.and(q.or(r));//i는 200보다 작거나 짝수다 ->t i는 100보다 작다->t
        System.out.println(all.test(150));

        String str1 = "adgfdbc";//만약 new str1("abc")=="abc"하면 f나옴 주소 비교 하기때문에.
        String str2 = "abc";

        Predicate<String> p2 = Predicate.isEqual(str1);//==안해도 참 나옴
        boolean result = p2.test(str2);
        System.out.println(result);
    }
}
