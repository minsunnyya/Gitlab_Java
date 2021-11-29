package Chapter14.Lambda_Stream;

import java.util.*;
import java.util.stream.*;

public class Ex14_5 {
    public static void main(String[] args) {
        Stream<Student000> studentStream = Stream.of(
                new Student000("김자바",1,200),
        new Student000("이자바",2,400),
        new Student000("박자바",3,300),
        new Student000("최자바",3,200),
        new Student000("유자바",2,100),
        new Student000("허자바",1,100),
        new Student000("서자바",3,300),
        new Student000("라자바",4,500),
        new Student000("네자바",3,600)
                );

        studentStream.sorted(Comparator.comparing(Student000::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}

class Student000 implements Comparable<Student000>{//비교대상 매서드 있어야함
    String name;
    int ban;
    int TotalScore;

    Student000(String name, int ban, int TotalScore){
        this.name = name;
        this.ban = ban;
        this.TotalScore = TotalScore;
    }

    public int compareTo(Student000 s){
        return s.TotalScore-this.TotalScore;
    }

    String getName() {return name;}
    int getBan() {return ban;}
    int getTotalScore() {return TotalScore;}
public String toString() {
        return String.format("[%s,%d,%d]",name,ban,TotalScore);
}

}
