package ChapterTwo;

import java.util.Scanner;

/**
 * Created by Jesse Hermon on 3/08/2016.
 */
public class InchesToFeetInteractive {
    public static void main(String[] args) {
        final int FEET_CONVERSION = 12;
        Scanner input = new Scanner(System.in);
        int inches;
        System.out.print("How many inches >> ");
        inches = input.nextInt();
        int feet = inches / FEET_CONVERSION;
        int remainderInches = inches % FEET_CONVERSION;
        System.out.println(inches + " inches becomes " + feet + " feet and " + remainderInches + " inches." );

    }
}
