package ChapterThree;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class SammysRentalPriceWithMethods {
    public static void main(String[] args) {

        int rentalTime = rentalTimeInput();
        companyLogo();
        rentalCalculations(rentalTime);





    }
    public static void rentalCalculations(int rentalTime){
        final int PRICE_PER_HOUR = 40;
        final int PRICE_PER_MINUTE = 1;

        int numberOfHours = rentalTime / 60;
        rentalTime = rentalTime - numberOfHours * 60;
        int numberOfMinutes = rentalTime;

        int rentalCost = numberOfHours * PRICE_PER_HOUR + numberOfMinutes * PRICE_PER_MINUTE;


        System.out.println("Number of hours rented: " + numberOfHours);
        System.out.println("Number of additional minutes rented: " + numberOfMinutes);
        System.out.println("Total cost: $" + rentalCost);
    }
    public static void companyLogo(){
        System.out.println("");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ss Sammy's makes it fun in the sun  Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("");
    }
    public static int rentalTimeInput(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rental duration(minutes) >> ");
        int rentalTime;
        rentalTime = input.nextInt();
        return rentalTime;
    }
}
