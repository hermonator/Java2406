package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public abstract class PhoneCall {
    protected String phoneNumber;
    protected double price;

    protected PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        setPrice();


    }

    protected void setPrice(){
        price = 0.00;
    }

    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void displayInfo();
}
