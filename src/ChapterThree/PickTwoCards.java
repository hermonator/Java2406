package ChapterThree;

/**
 * Created by Jesse Hermon on 19/08/2016.
 */
public class PickTwoCards {
    public static void main(String[] args) {

        final int CARDS_IN_SUIT = 13;
        int myValue;
        myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

        Card cardOne = new Card();
        Card cardTwo = new Card();

        cardOne.setCardNum(myValue);
        cardOne.setSuit('d');
        myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);

        cardTwo.setCardNum(myValue);
        cardTwo.setSuit('s');

        System.out.println("The first card is " + cardOne.getCardNum() + cardOne.getSuit());
        System.out.println("The second card is " + cardTwo.getCardNum() + cardTwo.getSuit());


    }
}
