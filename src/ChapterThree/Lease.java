package ChapterThree;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class Lease {

    private String name;
    private int apartmentNumber;
    private double rentAmount;
    private int leaseInMonths;

    public Lease()
    {
        name = "XXX";
        apartmentNumber = 0;
        rentAmount = 1000;
        leaseInMonths = 12;

    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setLeaseInMonths(int leaseInMonths) {
        this.leaseInMonths = leaseInMonths;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public int getLeaseInMonths() {
        return leaseInMonths;
    }

    public String getName() {
        return name;
    }

    public void addPetFee(){
        rentAmount = rentAmount + 10;
        explainPetPolicy();
    }
    public static void explainPetPolicy(){
        System.out.println("Pets can only be dogs and will incur a fee of $10");
    }

}
