package ChapterThree;

import java.util.Scanner;

/**
 * Created by jc259420 on 9/08/16.
 */
public class PaintCalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Getting the user input
        System.out.print("Enter the length (ft) >> ");
        double length = input.nextDouble();
        System.out.print("Enter the height (ft) >> ");
        double height = input.nextDouble();
        System.out.print("Enter the width (ft) >> ");
        double width = input.nextDouble();

        // The inner wall are calculations
        double totalCost = wallAreaCalculator(length,height,width);

        // Display the final statement
        System.out.println("The cost to paint a " + length + "-by-" + width + "-foot room with " + height +
        "-foot ceilings is $" + totalCost);



    }

    // Using the inputted values provided by the user calculates the inner wall area
    public static double wallAreaCalculator(double length, double height, double width)
    {

        // Constant for price per gallon
        int PRICE_PER_GALLON = 32;

        // Passing the wall area to the gallon calculator function
        double wallAreaCalc = (2 * length * height) + (2 * width * height);

        // passing the calculation of the gallon amount to another method
        double gallonAmount = gallonsCalculator(wallAreaCalc);

        // Displays the amount of gallons require to paint the wall
        System.out.println(gallonAmount + "gallons to paint the inner wall surface area.");

        // Calculating cost
        double cost = gallonAmount * PRICE_PER_GALLON;

         return cost;

    }

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
