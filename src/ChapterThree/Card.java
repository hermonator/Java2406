package ChapterThree;

/**
 * Created by Jesse Hermon on 19/08/2016.
 */
public class Card {
    private char suit;
    private int cardNum;

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardNum() {
        return cardNum;
    }

    public char getSuit() {
        return suit;
    }
}
