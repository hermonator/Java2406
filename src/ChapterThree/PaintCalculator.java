package ChapterThree;

import java.util.Scanner;

/**
 * Created by jc259420 on 9/08/16.
 */
public class PaintCalculator {
    public static void main(String[] args) {

        // Constant for price per gallon
        int PRICE_PER_GALLON = 32;

        Scanner input = new Scanner(System.in);

        // Getting the user input
        System.out.print("Enter the length (ft) >> ");
        double length = input.nextDouble();
        System.out.print("Enter the height (ft) >> ");
        double height = input.nextDouble();
        System.out.print("Enter the width (ft) >> ");
        double width = input.nextDouble();

        // The inner wall are calculations
        double innerWallArea = (2 * height * length) + (2 * height * length);

        // Passing the wall area to the gallon calculator function
        double gallonAmount = gallonsCalculator(innerWallArea);

        // Displays the amount of gallons require to paint the wall
        System.out.println(gallonAmount + "to paint the inner wall surface area.");



    }

    // Using the inputter values provided by the user calculates the inner wall area
    public static double wallAreaCalculator(double length, double height, double width)
    {}

    // Use a constant to calculate the amount of gallons required for the current wall area
    public static double gallonsCalculator(double wallArea)
    {
        // Feet per gallon constant
        int FEET_PER_GALLON = 350;

        // Gallons calculation
        double gallons = wallArea / FEET_PER_GALLON;
        return gallons;
    }
}
