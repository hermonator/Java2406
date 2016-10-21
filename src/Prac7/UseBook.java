package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class UseBook {

    public static void main(String[] args) {
        System.out.println("Demonstrating the use of both the fiction and non fiction classes...");

        Fiction war = new Fiction("War");
        System.out.println("The fiction book " + war.getName() + " costs: $" + war.getPrice());

        NonFiction peace = new NonFiction("Peace");
        System.out.println("The Non-fiction book " + peace.getName() + " costs: $" + peace.getPrice());
    }
}
