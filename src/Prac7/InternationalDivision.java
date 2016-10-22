package Prac7;

/**
 * Created by jc259420 on 22/10/2016.
 */
public class InternationalDivision extends Division {

    private String country;
    private String language;

    public InternationalDivision(String name, int accountNumber, String country, String language){
        super(name, accountNumber);
        this.country = country;
        this.language = language;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(accountNumber);
        System.out.println(country);
        System.out.println(language);
        System.out.println();

    }

}
