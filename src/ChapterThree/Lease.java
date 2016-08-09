package ChapterThree;

import java.util.Scanner;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class Lease {

    private String name;
    private int apartmentNumber;
    private double rentAmount;
    private int leaseInMonths;

    public Lease(){
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
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name >> ");
        name = input.nextLine();
        System.out.print("Enter apartment number >> ");
        apartmentNumber = input.nextInt();
        System.out.print("Enter rent amount >> ");
        rentAmount = input.nextDouble();
        System.out.print("Enter term duration >> ");
        leaseInMonths = input.nextInt();
    }
    public void showValue(){
        System.out.print("Name: " + getName());

        System.out.println("");
        System.out.print("Apartment number: " + getApartmentNumber());

        System.out.println("");
        System.out.print("Rent amount: $" + getRentAmount());

        System.out.println("");
        System.out.print("Term duration: " + getLeaseInMonths());
        System.out.println("\n");

    }

}
