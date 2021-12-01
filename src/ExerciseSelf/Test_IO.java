package ExerciseSelf;

import java.io.*;

public class Test_IO {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("Test_IO.txt");//파일을 쓰기위해 객체 생성
        for(int i =1; i<=9; i++){
            String data = i+",스티브리"+",0101234123"+i+"\r\n";//데이터를 스트링으로 담음
            fw.write(data);//데이터 씀
        }
        fw.close();//사용하면 꼭 닫아줘야함
    }
}
