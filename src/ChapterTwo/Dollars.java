package ChapterTwo;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class Dollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in whole numbers the dollar amount >> $");
        int amount;
        amount = input.nextInt();
        int numberOfTwenties = amount / 20;
        amount = amount - numberOfTwenties * 20;
        int numberOfTens = amount / 10;
        amount = amount - numberOfTens * 10;
        int numberOfFives = amount / 5;
        amount = amount - numberOfFives * 5;
        int numberOfOnes = amount;

        System.out.println("Number of 20s: " + numberOfTwenties);
        System.out.println("Number of 10s: " + numberOfTens);
        System.out.println("Number of 5s: " + numberOfFives);
        System.out.println("Number of 1s " + numberOfOnes);


    }

}
