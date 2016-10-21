package Prac7;

import java.util.Scanner;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class PhoneCallArray {
    static PhoneCall[] callLog = new PhoneCall[10];
    public static void main(String[] args) {
        creatingLog();
        displayingLog();
    }
    public static void creatingLog(){
        Scanner input = new Scanner(System.in);

        String randomNum = "4033545";
        for (int i = 0; i < callLog.length; i++){
            System.out.print("Incoming or outgoing call (i/o): ");
            if (input.nextLine() == "i"){
                callLog[i] = new IncomingPhoneCall(randomNum + i);
            }else{
                callLog[i] = new OutGoingPhoneCall((randomNum + i), i);
            }
        }
    }
    public static void displayingLog(){
        for (int j = 0; j < callLog.length ; j++){
            callLog[j].displayInfo();
        }
    }
}
