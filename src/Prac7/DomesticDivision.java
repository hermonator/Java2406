package Prac7;

/**
 * Created by jc259420 on 22/10/2016.
 */
public class DomesticDivision extends  Division{

    private String state;

    public DomesticDivision(String name, int accountNumber, String state){

        super(name,accountNumber);
        this.state = state;

    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(accountNumber);
        System.out.println(state);
        System.out.println();

    }
}
