package ChapterTwo;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class RandomGuessMatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 5 inclusive >> ");
        int guess;
        guess = input.nextInt();

        int random = 1 + (int)(Math.random() * 5);

        System.out.println("The difference between your guess and the random number is: " + (guess - random));

        if (random == guess){
            System.out.println(guess + " is True.");
        } else {
            System.out.println(guess + " is False.");
        }

    }
}
