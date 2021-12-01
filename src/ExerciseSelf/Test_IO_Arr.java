//package ExerciseSelf;
//
//import java.io.*;
//import java.util.*;
//
//import static java.lang.System.in;
//
//public class Test_IO_Arr {
//    static ArraysList<Test_IO_Class> phone = new ArrayList<Test_IO_Class>();
//
//    public static void readFileAddList(String filepath){
//        try {
//            DataInputStream dis = new DataInputStream(new FileInputStream(filepath));
//
//            while (true){
//                String text = dis.readLine();
//
//                if(text==null){
//                    break;
//                }
//                String[] strArr = text.split(",");
//
//                phone.add(new Test_IO_Class(strArr[0],strArr[1]));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public static void printPhoneList() {
//        for(Phone phone : Test_IO_Class){
//            System.out.println(phone);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println("start");
//        readFileAddList(Properties.filePath);
//        printPhoneList();
//    }
//}