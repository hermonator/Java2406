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
        rentalTime = rentalTime - this.numberOfHours * 60;
        this.numberOfMinutes = rentalTime;

        this.price = this.numberOfHours * HOURLY_RATE + this.numberOfMinutes * HOURLY_RATE;

        System.out.println("Number of hours rented: " + this.numberOfHours);
        System.out.println("Number of additional minutes rented: " + this.numberOfMinutes);
        System.out.println("Total cost: $" + this.price);

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
}
