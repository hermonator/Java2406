package ChapterTwo;
import java.util.Scanner;
/**
 * Created by jc259420 on 4/08/2016.
 */
public class MadLib {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String object;
        String animal;
        String name;
        String title;

        System.out.print("Enter an object >> ");
        object = input.nextLine();
        //input.nextLine();
        System.out.print("Enter an animal in plural form >> ");
        animal = input.nextLine();
        //input.nextLine();
        System.out.print("Enter a person's name >> ");
        name = input.nextLine();
        //input.nextLine();
        System.out.print("Enter a title of a person >> ");
        title = input.nextLine();

        System.out.println("Humpty dumpty sat on a " + object);
        System.out.println(name + " dumpty had a great fall;");
        System.out.println("All the kings " + animal + " and all the " + title + " men");
        System.out.println("Couldnt put humpty together again.");
    }
}
