package ChapterThree;
import java.util.Scanner;

/**
 * Created by Jesse Hermon on 8/08/2016.
 */
public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your name >> ");
        String name = input.nextLine();
        System.out.print("Enter your GPA >> ");
        double gradePointAverage = input.nextDouble();
        creditCalculation(name,gradePointAverage);


    }
    public static void creditCalculation(String name, double gpa)
    {
        int BOOK_STORE_CREDIT_BONUS = 10;
        double storeCredit = BOOK_STORE_CREDIT_BONUS * gpa;

        System.out.println(name + " achieved a GPA of " + gpa + " , for this you are being awarded $" + storeCredit + " to use in the bookstore.");

    }
}
