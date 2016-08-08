package ChapterThree;
import java.util.Scanner;

/**
 * Created by Jesse Hermon on 8/08/2016.
 */
public class Percentages2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number >> ");
        double var1 = input.nextDouble();
        System.out.print("Enter the second number >> ");
        double var2 = input.nextDouble();


        computePercent(var1,var2);
        computePercent(var2,var1);

    }
    public static void computePercent(double var1,double var2)
    {
        double percentage = var1 / var2 * 100;
        System.out.println(var1 + " is " + percentage + " percent of " + var2);
    }
}
