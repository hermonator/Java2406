package ChapterTwo;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class TicketNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 6 digit ticket number >> ");
        String ticketNumberString;
        // Step 1
        ticketNumberString = input.nextLine();


        // Step 2
        String divisorNumberString = ticketNumberString.substring(5,6);
        int num = Integer.parseInt(ticketNumberString.substring(0, 5));

        // Step 3
        int divisorNumber = Integer.parseInt(divisorNumberString);
        int check = num % 7;

        if (check == divisorNumber){
            System.out.println("The ticket number: " + ticketNumberString + " is valid.");
        } else {
            System.out.println("The ticket number: " + ticketNumberString + " is invalid");
        }

    }
}
