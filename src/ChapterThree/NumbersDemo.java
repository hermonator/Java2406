package ChapterThree;

/**
 * Created by Jesse Hermon on 6/08/2016.
 */
public class NumbersDemo {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 11;

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
