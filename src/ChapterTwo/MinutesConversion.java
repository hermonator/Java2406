package ChapterTwo;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class MinutesConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes >> ");
        int minutes;
        minutes = input.nextInt();

        double hours = minutes / 60.0;
        double days = minutes / (60.0 * 24);

        System.out.format("%d minutes equals %.3f hours and equals %.3f days.", minutes , hours, days);
    }
}
