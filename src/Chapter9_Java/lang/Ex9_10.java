package Chapter9_Java.lang;

public class Ex9_10 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);

        double dVal = 200.2;
        String strVal2 = dVal +"";

        double sum = Integer.parseInt("+"+strVal)+Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal)+Double.valueOf(strVal2);

        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
        System.out.println(strVal+"+"+strVal2+"="+sum2);
    }
}
