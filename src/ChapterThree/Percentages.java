package ChapterThree;

/**
 * Created by Jesse Hermon on 8/08/2016.
 */
public class Percentages {
    public static void main(String[] args) {

        double var1 = 5;
        double var2 = 10;

        computePercent(var1,var2);
        computePercent(var2,var1);

    }
    public static void computePercent(double var1,double var2)
    {
        double percentage = var1 / var2 * 100;
        System.out.println(var1 + " is " + percentage + " percent of " + var2);
    }
}
