package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class OutGoingPhoneCall extends PhoneCall {
    private int callDuration;
    public OutGoingPhoneCall(String PhoneNumber,int callDuration){
        super(PhoneNumber);
        this.callDuration = callDuration;
        setPrice();
    }
    @Override
    protected  void setPrice() {price = 0.04;}

    public double getPrice(){return price;}
    public String getPhoneNumber(){return phoneNumber;}

    public void displayInfo(){
        System.out.println("Call information:\nPhone number: " + phoneNumber + "\nCost: $" + price + "\nCall Duration: " + callDuration + "\nRate: $" + price * callDuration + " per minute");
    }
}
