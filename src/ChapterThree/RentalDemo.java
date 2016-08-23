package ChapterThree;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class RentalDemo {
    public static void main(String[] args) {


        Rental rental1 = new Rental();

        contractNumberInput(rental1);
        rental1.setHoursAndMinutes(rentalTimeInput());
        rental1.motto();
        rentalCalculations(rental1);





    }
    public static void rentalCalculations(Rental rental1){
        System.out.println("Contract Number : " + rental1.getContractNumber());
        System.out.println("Number of hours rented: " + rental1.getNumberOfHours());
        System.out.println("Number of additional minutes rented: " + rental1.getNumberOfMinutes());
        System.out.println("Total cost: $" + rental1.getPrice());





    }

    public static int rentalTimeInput(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rental duration(minutes) >> ");
        int rentalTime;
        rentalTime = input.nextInt();
        return rentalTime;
    }
    public static void contractNumberInput(Rental rental1){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the contract number >> ");

        rental1.setContractNumber(input.nextLine());

    }
}
