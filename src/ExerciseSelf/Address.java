package ExerciseSelf;
import java.util.Comparator;

public class Address {


        //변수 선언
        String num;
        String name;
        String tel;

        public Address() {
        }//생성자 ;표시 없음

        public Address(String num, String name, String tel) {
            super();
            this.num = num;
            this.name = name;
            this.tel = tel;
        }

        public String getName() {
            return name;
        }

        public String getNum() {
            return num;
        }

        public String getTel() {
            return tel;
        }


        @Override
        public String toString() {
            return "Test_IO_Class[num =" + num + "+, name=" + name + ", tel" + tel + "]";
        }
    }
}

