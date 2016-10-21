package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public abstract class NewspaperSubscription {
    protected String subscriber;
    protected String name;
    protected String address;
    protected double rate;

    public NewspaperSubscription(String subscriber, String address, String name){
        this.subscriber = subscriber;
        setAddress(address);
        setName(name);


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setAddress(String address);

    public void displayInfo(){
        System.out.println("Subscriber name: " + subscriber + "\nName: " + name + "\nAddress: " + address + "\nRate: " + rate);
    }

}
