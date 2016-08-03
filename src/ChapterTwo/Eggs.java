package ChapterTwo;
import java.util.Scanner;
/**
 * Created by Jesse Hermon on 3/08/2016.
 */
public class Eggs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many eggs would you like >> ");
        int eggs;
        eggs = input.nextInt();
        final int DOZEN_EGGS = 12;
        final double DOZEN_EGGS_PRICE = 3.25;
        final double  SINGLE_EGG_PROCE = 0.45;

        int amountOfDozenEggs = eggs / DOZEN_EGGS;
        int amountOfSingleEggs = eggs % DOZEN_EGGS;
        double priceForDozenEggs = amountOfDozenEggs * DOZEN_EGGS_PRICE;
        double priceForSingleEggs = amountOfSingleEggs * SINGLE_EGG_PROCE;
        double total = priceForDozenEggs + priceForSingleEggs;

        System.out.println("You ordered " + eggs + " eggs. \nThat's " + amountOfDozenEggs +
                " dozen at $" + DOZEN_EGGS_PRICE + " per dozen and " +
                amountOfSingleEggs + " loose eggs at " + ((int) (SINGLE_EGG_PROCE * 100)) +
                " cents \neach for a total of $" + total + ".");

    }
}
