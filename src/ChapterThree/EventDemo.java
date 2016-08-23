package ChapterThree;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class EventDemo {
    public static void main(String[] args) {

        // Event Declaration
        Event event1 = new Event();

        event1.setNumberOfGuests(numberOfPeople());

        event1.setEventNumber(eventNumber());
        motto();
        display(event1);


    }
    public static String eventNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the event number >> ");
        String eventNumbers;
        eventNumbers = input.nextLine();
        return (eventNumbers);
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
    public static void display(Event eventNum){


        System.out.println("Event Number: " + eventNum.getEventNumber());
        System.out.println("Number of guests: " + eventNum.getNumberOfGuests());
        System.out.println("Price per guest: $35");
        System.out.println("Total pricing: $" + eventNum.getCostings());


        if (eventNum.getNumberOfGuests() >= 50){
            System.out.println("Large party status: True");
        } else{
            System.out.println("Large party status: False");
        }
    }
}
