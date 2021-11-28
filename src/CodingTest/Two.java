package CodingTest;

//단어 s의 가운데 글자를 반환하는 함수,
//solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

class Two {

    public String solution(String s) {
        String answer = "";
        //글자를 하나씩 읽어오기 위해 ->String to int변환 해줌
        //길이 알아내기 위해 length()소환
        int a = s.length() / 2;// -> a= 2 1234->index[1]=2, index[2]=3
        int a1 = s.length() % 2; //a1%2==0이면 짝수
        //System.out.println(a);
       // System.out.println(a1);

        //System.out.println(a);
        //System.out.println(b);
        if (s.length()==0) { //짝수일때
            answer = Character.toString(s.charAt(a - 1)) + Character.toString(s.charAt(a));
            //String을 Character로 변환
        } else{//홀수일때
         answer = Character.toString(s.charAt(a));


    }
        //1234에서 23을 읽어와야함,
        // answer = Character.toString(s.substring())

        return answer;

    }




    public static void main(String[] args) {
        Two letter = new Two();
        System.out.println(letter.solution("1234"));
    }
}