package ChapterThree;

import java.util.Scanner;

/**
 * Created by Jesse Hermon on 8/08/2016.
 */
public class MetricConversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value to be converted >> ");
        double decimalValue = input.nextDouble();

        incheToCentimeters(decimalValue);
        gallonsToLiters(decimalValue);

    }
    public static void incheToCentimeters(double inches)
    {
        double centimeters = inches * 2.54;
        System.out.println(inches + "in is " + centimeters + "cm");
    }

    public static void gallonsToLiters(double gallons)
    {
        double liters = gallons * 3.7854;
        System.out.println(gallons + " gallons is " + liters + "L");
    }

}
