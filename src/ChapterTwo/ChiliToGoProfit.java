package ChapterTwo;
import java.util.Scanner;
/**
 * Created by Jesse Hermon on 3/08/2016.
 */
public class ChiliToGoProfit {
    public static void main(String[] args) {
        // Consumer purpose constants
        final double ADULT_MEAL = 7.00;
        final double CHILDS_MEAL = 4.00;

        // Employer purpose constants
        final double ADULT_MEAL_COSTINGS = 4.35;
        final double CHILDS_MEAL_COSTINGS = 3.10;

        // Consumer information
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of adult meals >> ");
        int numberOfAdultMeals;
        numberOfAdultMeals = input.nextInt();
        System.out.print("Enter the number of children meals >> ");
        int numberOfChildrenMeals;
        numberOfChildrenMeals = input.nextInt();
        double costOfAdultMeals = numberOfAdultMeals * ADULT_MEAL;
        double costOfChildrenMeals = numberOfChildrenMeals * CHILDS_MEAL;
        double totalCost = costOfAdultMeals + costOfChildrenMeals;

        // Employer information
        double childrenMealSingleProfit = CHILDS_MEAL - CHILDS_MEAL_COSTINGS;
        double adultsMealSingleProfit = ADULT_MEAL - ADULT_MEAL_COSTINGS;
        double childrenMealProfit = numberOfChildrenMeals * childrenMealSingleProfit;
        double adultMealProfit = numberOfAdultMeals * adultsMealSingleProfit;
        double totalProfit = adultMealProfit + childrenMealProfit;


        System.out.println("Total cost: $" + totalCost + "\nAdult meal costs: $" + costOfAdultMeals +
                "\nChildren meal cost: $" + costOfChildrenMeals);
        System.out.println("");
        System.out.println("Total profit: $" + totalProfit + "\nChildren's meal profit: $" + Math.round(childrenMealProfit) +
                "\nAdult's meal profit: $" + Math.round(adultMealProfit));
    }
}
