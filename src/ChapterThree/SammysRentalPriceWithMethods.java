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
