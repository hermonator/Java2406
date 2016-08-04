package ChapterThree;
import java.util.Scanner;
/**
 * Created by Jesse Hermon on 5/08/2016.
 */
public class TestInfo {
    public static void main(String[] args) {
        System.out.println("Calling method from another class:");
        double price;
        double discount;
        double savings;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter cutoff price for discount >> ");
        price = keyboard.nextDouble();
        System.out.print("Enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();

        ParadiseInfo2.displayInfo();
        savings = computeDiscountInfo(price, discount);

        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a saving of at least $" + savings);
    }
    public static double computeDiscountInfo(double pr, double dscnt)
    {
        double savings;
        savings = pr * dscnt / 100;
        return savings;
    }
}
