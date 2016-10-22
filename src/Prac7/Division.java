package Prac7;

import com.sun.org.apache.xpath.internal.operations.Div;

/**
 * Created by jc259420 on 22/10/2016.
 */
public abstract class Division {

    protected String name;
    protected int accountNumber;

    public Division(String name , int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public abstract void displayInfo();


}
