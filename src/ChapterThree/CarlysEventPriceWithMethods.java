package ChapterThree;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class CarlysEventPriceWithMethods {
    public static void main(String[] args) {

        int guestNumber = numberOfPeople();

        motto();

        pricing(guestNumber);



    }
    public static int numberOfPeople(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of guests >> ");
        int guestNumber;
        guestNumber = input.nextInt();
        return (guestNumber);
    }
    public static void motto(){
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("* Carly's makes the food that makes it a party. *");
        System.out.println("*************************************************");

    }
    public static void pricing(int guestNumber){

        int totalPrice = guestNumber * PRICE_PER_PERSON;
        System.out.println("Number of guests: " + guestNumber);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total pricing: $" + totalPrice);


        if (guestNumber >= 50){
            System.out.println("Large party status: True");
        } else{
            System.out.println("Large party status: False");
        }
    }
}
