package Chapter8_Exception.Question;


class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];//객체 생성

    SutdaDeck(){
//        int j = 0;
//        for(int i = 1; i<=10; i++){
//            if (j ==1||j==3||j==8)
//                System.out.println("광");}

        for(int i = 1; i<cards.length; i++)
            boolean isKwang = (num == 1|| num == 2 || num == 8)

    }
}



class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "k":"");
    }
}
public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i = 0; i < deck.cards.length; i++)
            System.out.println(deck.cards[i]+",");
    }
}
