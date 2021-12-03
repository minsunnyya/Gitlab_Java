package ExerciseSelf;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test_IO_Read {
    public static void main(String[] args) throws IOException {
        try {
            File text = new File("C:\\Users\\user\\Desktop\\Java\\java\\Test_IO.txt");//txt파일을 가져와 File객체 생성

            FileReader fr = new FileReader(text);//파일 읽어오기, 파일객체를 읽을 수 있는 스트림

            BufferedReader br = new BufferedReader(fr);//생성한 스트림으로 버퍼 생성



            ArrayList<String> lines = new ArrayList<String>();//ArrayList에 저장
            String line = "";
            System.out.println(lines);
            lines.add("10,스티브리,010123412310");

            while ((line = br.readLine()) != null) {//버퍼를 통해 한줄 한줄 리스트에 담음
                lines.add(line);

            }
            br.close();

            for (int i = 0; i < lines.size(); i++) {
                System.out.println(lines.get(i));
                //lines.add(9,"10,스티브리,0101234123");
            }

            FileWriter fw = new FileWriter("Test_IO.txt2");//파일을 쓰기위해 객체 생성
            ArrayList<String> data = lines;
            fw.write(String.valueOf(data));

            fw.close();
        } catch (Exception e) {


        }
    }
}
//class Test_IO_Class {
//    //변수 선언
//    String name;
//    String tel;
//
//    Test_IO_Class() {
//
//    }//생성자 ;표시 없음
//
//    public Test_IO_Class(String name, String tel) {
//        super();
//        this.name = name;
//        this.tel = tel;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String
//
//    void setName() {
//        this.tel = tel;
//    }
//
//    @Override
//    public String toString() {
//        return "Test_IO_Class[name=" + name + ", tel" + tel + "]";
//    }
//
//}