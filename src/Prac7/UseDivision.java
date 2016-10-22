package Prac7;

/**
 * Created by jc259420 on 22/10/2016.
 */
public class UseDivision {

    public static void main(String[] args) {
        System.out.println("Demonstrating the international division class...");
        InternationalDivision division1 = new InternationalDivision("bobs",101,"australia","english");
        division1.displayInfo();

        System.out.println();

        System.out.println("Demonstrating the domestic division class...");
        DomesticDivision division2 = new DomesticDivision("clares",102,"QLD");
        division2.displayInfo();
    }


}
