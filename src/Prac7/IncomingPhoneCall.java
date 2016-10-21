package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class IncomingPhoneCall extends PhoneCall{
    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        setPrice();
    }
    @Override
    protected void setPrice(){
        price = 0.02;
    }

    public double getPrice() {
        return price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void displayInfo() {
        System.out.println("Call information:\nPhone number: " + phoneNumber + "\nCost: $" + price + "\nRate: $" + price + " per minute");
    }
}
