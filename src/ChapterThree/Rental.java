package ChapterThree;

/**
 * Created by jc259420 on 23/08/2016.
 */
public class Rental {

    public final static int MINUTES_PER_HOUR = 60;
    public final static int HOURLY_RATE = 40;
    private String contractNumber;
    private int numberOfHours;
    private int numberOfMinutes;
    private double price;

    public void setContractNumber(String contractNumber){
        this.contractNumber = contractNumber;

    }
    public void setHoursAndMinutes(int rentalTime){

        this.numberOfHours = rentalTime / 60;
        rentalTime = rentalTime - (this.numberOfHours * 60);
        this.numberOfMinutes = rentalTime;

        this.price = this.numberOfHours * HOURLY_RATE + this.numberOfMinutes;



    }

    public String getContractNumber() {
        return contractNumber;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public double getPrice() {
        return price;
    }
    public static void motto(){
        System.out.println("");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("Ss Sammy's makes it fun in the sun  Ss");
        System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
        System.out.println("");
    }
}
