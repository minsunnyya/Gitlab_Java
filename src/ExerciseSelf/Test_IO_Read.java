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

            List<String> lines = new ArrayList<String>();//ArrayList에 저장
            String line = "";

            while ((line = br.readLine()) != null) {//버퍼를 통해 한줄 한줄 리스트에 담음 
                lines.add(line);
            }
            br.close();

            for (int i = 0; i < lines.size(); i++) {
                System.out.println(i + "번 데이터 : " + lines.get(i));
            }


        } catch (Exception e) {


        }
    }
}
