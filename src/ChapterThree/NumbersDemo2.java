package ChapterThree;
import java.util.Scanner;

/**
 * Created by Jesse Hermon on 6/08/2016.
 */
public class NumbersDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer >> ");
        int var1 = input.nextInt();
        System.out.print("Enter another integer >> ");
        int var2 = input.nextInt();

        displayTwiceTheNumber(var1);
        displayNumberPlusFive(var1);
        displayNumberSquared(var1);

        displayTwiceTheNumber(var2);
        displayNumberPlusFive(var2);
        displayNumberSquared(var2);

    }

    public static void displayTwiceTheNumber(int var)
    {
        System.out.println((var * 2));
    }
    public static void displayNumberPlusFive(int  var)
    {
        System.out.println(var + 5);
    }
    public static void displayNumberSquared(int var)
    {
        System.out.println(var * var);
    }
}
