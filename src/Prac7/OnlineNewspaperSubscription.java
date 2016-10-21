package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class OnlineNewspaperSubscription extends NewspaperSubscription {

    public OnlineNewspaperSubscription(String subscriber, String address, String name){
        super(subscriber,address,name);
    }

    public void setAddress(String address) {
        this.address = address;
        boolean webExists = false;

        for(char c : address.toCharArray()){
            if (c == '@'){
                webExists = true;
            }
        }
        if(webExists){this.rate = 9;}else{
            System.out.println("Error!!!");
            this.rate = 0;}


    }
}
