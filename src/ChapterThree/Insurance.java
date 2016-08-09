package ChapterThree;

import java.util.Scanner;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class Insurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year >> ");
        int birthYear = input.nextInt();
        System.out.print("Enter the current year >> ");
        int currentYear = input.nextInt();

        int insuranceCost = insuranceCalculator(birthYear,currentYear);

        System.out.println("Insurance Costings: $" + insuranceCost);


    }

    public static int insuranceCalculator(int birthYear, int currentYear)
    {
        int insuranceCost = (((currentYear - birthYear) / 10) + 15) * 20;

        return insuranceCost;
    }

}
