package ChapterThree;
import ChapterThree.Sandwich;
/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class TestSandwich {
    public static void main(String[] args) {
        Sandwich first = new Sandwich();
        first.setMainIngredient("Cheese");
        first.setBreadType("Wholegrain");
        first.setPrice(3.50);

        System.out.println(first.getPrice());
        System.out.println(first.getMainIngredient());
    }
}
