package Prac6;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class DemoPoems {

    public static void main(String[] args) {

        System.out.println("This is a demonstration of a poem...");
        Poem poem1 = new Poem("New Dawn",14);
        System.out.println(poem1.getName() + " has " + poem1.getNumberOfLines() + " lines.");



        System.out.println("This is a demonstration of a couplet...");
        Couplet couplet1 = new Couplet("New Luncheon", "The past");
        System.out.println(couplet1.getName() + "with the title " + couplet1.getTitle() + " has " + couplet1.getNumberOfLines() + " lines.");

        System.out.println("This is a demonstration of a limerick...");
        Limerick limerick1 = new Limerick("New Dinner","The future");
        System.out.println(limerick1.getName() + "with the title " + limerick1.getTitle() + " has " + limerick1.getNumberOfLines() + " lines.");

        System.out.println("This is a demonstration of a haiku...");
        Haiku haiku1 = new Haiku("New dessert", "The long forgotten");
        System.out.println(haiku1.getName() + "with the title " + haiku1.getTitle() + " has " + haiku1.getNumberOfLines() + " lines.");
    }




}
