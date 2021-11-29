package Chapter14.Lambda_Stream;

import java.util.*;
import java.util.function.*;

public class Ex14_2 {
    public static void main(String[] args) {
        Supplier<Integer>   s = ()->(int)(Math.random()*100)+1;//매개변수 없고, 반환값만 있음
        Consumer<Integer>   c = i-> System.out.println(i+",");//매개 변수 있고, 반환 값 없음
        Predicate<Integer>  p = i -> i%2==0;
        Function<Integer,Integer>   f = i ->i/10*10;//매개변수 받아서 반환

        List<Integer> list = new ArrayList<>();
        makeRandomList(s,list);//list를 랜덤값으로 채운다
        System.out.println(list);
        printEvenNum(p,c,list);//짝수를 출력
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);

    }

    static <T> List<T> doSomething(Function<T,T>f,List<T> list){//1의 자리 없애는 람다식을 리스트에 적용
        List<T> newList = new ArrayList<T>(list.size());//리스트와 똑같은 사이즈 만듬

        for(T i : list){
            newList.add(f.apply(i));//일의 자리 없애서 새로운 list에 저장
        }
        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){//짝수인거를 pre로 받고 어떤 작업할지 con
        System.out.print("[");
        for(T i : list){
            if(p.test(i))//짝수인지 검사
                c.accept(i);//true일 경우에만 반환
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s,List<T> list){
        for(int i =0; i<10; i++){//Supplier로 부터 1~100의 난수를 받아서 list에 추가
            list.add(s.get());
        }
    }
}
