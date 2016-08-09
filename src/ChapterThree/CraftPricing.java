package ChapterThree;

import java.util.Scanner;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class CraftPricing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the product >> ");
        String name = input.nextLine();
        System.out.print("Enter the cost of the materials >> ");
        double costOfMaterials = input.nextDouble();
        System.out.println("Enter the number of hours you have worked on the project >> ");
        int numberOfHours = input.nextInt();

        double priceOfProduct = calculations(costOfMaterials, numberOfHours);

        System.out.println("Product name: " + name);
        System.out.println("Product cost: " + priceOfProduct);
    }


    public static double calculations(double costOfMaterials, int numberOfHours)
    {
        double priceOfProduct = ((costOfMaterials + 12) * numberOfHours) + 7;
        return priceOfProduct;
    }
}
