package ChapterTwo;

import java.util.Scanner;
/**
 * Created by Jesse Hermon on 3/08/2016.
 */
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int NUMBER_OF_QUARTS_PER_GALLON = 4;
        Scanner input = new Scanner(System.in);
        int paintJobQuarts;
        System.out.print("Enter quarts reqiured for the job >> ");
        paintJobQuarts = input.nextInt();
        int numberOfGallons = paintJobQuarts / NUMBER_OF_QUARTS_PER_GALLON;
        int remainderQuarts = paintJobQuarts % NUMBER_OF_QUARTS_PER_GALLON;

        System.out.println("A job that needs " + paintJobQuarts + " quarts requires " + numberOfGallons + " gallons plus " + remainderQuarts + " quarts.");

    }
}
