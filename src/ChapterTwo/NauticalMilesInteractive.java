package ChapterTwo;
import java.util.Scanner;

/**
 * Created by Jesse Hermon on 3/08/2016.
 */
public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final double NUMBER_OF_KILOMETER_PER_NAUTICAL_MILE = 1.852;
        final double NUMBER_OF_MILES_PER_NAUTICAL_MILE = 1.150779;
        Scanner input = new Scanner(System.in);
        int nauticalMiles;
        System.out.print("Enter the amount of nautical miles >> ");
        nauticalMiles = input.nextInt();
        double kilometers = nauticalMiles * NUMBER_OF_KILOMETER_PER_NAUTICAL_MILE;
        double miles = nauticalMiles * NUMBER_OF_MILES_PER_NAUTICAL_MILE;
        System.out.println("There are " + kilometers + " kilometers in " + nauticalMiles + " nautical miles.");
        System.out.println("There are " + miles + " miles in " + nauticalMiles + " nautical miles.");
    }
}
