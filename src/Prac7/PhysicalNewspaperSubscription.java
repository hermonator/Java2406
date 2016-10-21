package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    public PhysicalNewspaperSubscription(String subscriber, String address,String name){
        super(subscriber,address,name);

    }


    public void setAddress(String address) {
        this.address = address;
        boolean numExists = false;

        for(char c : address.toCharArray()){
            if (Character.isDigit(c)){
                numExists = true;
            }
        }
        if(numExists){this.rate = 15;}else{
            System.out.println("Error!!!");
            this.rate = 0;}


    }

}
