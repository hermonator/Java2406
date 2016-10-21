package Prac7;

import java.util.Scanner;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class DemoSubscriptions {

    static NewspaperSubscription[] subscribers = new NewspaperSubscription[10];

    public static void main(String[] args) {
        String subscriberName = "Person ";
        String subscriberAddress = " mywee st";
        String subscriberPersonName = "emily ";
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < subscribers.length; i++){
            System.out.println("Physcial copy or online copy (p/o): ");
            if(input.nextLine().equalsIgnoreCase("p")){
                subscribers[i] = new PhysicalNewspaperSubscription(subscriberName + i, i + subscriberAddress, subscriberPersonName + 1);
            }else{subscribers[i] = new OnlineNewspaperSubscription(subscriberName + i, i + subscriberAddress, subscriberPersonName + 1);}
        }
        for (int j = 0; j < subscribers.length; j++){
            subscribers[j].displayInfo();
        }


    }
}
