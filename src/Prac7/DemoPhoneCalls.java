package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class DemoPhoneCalls {
    public static void main(String[] args) {
        System.out.println("Demonstrating the incoming phone calls and the out going phone calls...");

        System.out.println("Incoming call");

        IncomingPhoneCall call1 = new IncomingPhoneCall("40545205");
        call1.displayInfo();

        System.out.println("Out Going call");

        OutGoingPhoneCall call2 = new OutGoingPhoneCall("40335600",6);
        call2.displayInfo();


    }
}
