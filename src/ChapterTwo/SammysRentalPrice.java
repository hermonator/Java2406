package ChapterTwo;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class SammysRentalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rental duration(minutes) >> ");
        int rentalTime;
        rentalTime = input.nextInt();

        int PRICE_PER_HOUR = 40;
        int PRICE_PER_MINUTE = 1;

        int numberOfHours = rentalTime / 60;
        rentalTime = rentalTime - numberOfHours * 60;
        int numberOfMinutes = rentalTime;

        int rentalCost = numberOfHours * PRICE_PER_HOUR + numberOfMinutes * PRICE_PER_MINUTE;

        System.out.println("");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ss Sammy's makes it fun in the sun  Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("");
        System.out.println("Number of hours rented: " + numberOfHours);
        System.out.println("Number of additional minutes rented: " + numberOfMinutes);
        System.out.println("Total cost: $" + rentalCost);

    }
}
