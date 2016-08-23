package ChapterFour;

/**
 * Created by jc259420 on 23/08/2016.
 */
public class FormLetterWriter {
    public static void main(String[] args) {
        String lastName = "Catter";
        displaySalutation(lastName);
        String firstName = "Bob";
        displaySalutation(firstName,lastName);

    }
    public static void displaySalutation(String lastName){
        String surname = lastName;
        System.out.println("Dear Mr. or Ms. " + surname);
    }
    public static void displaySalutation(String firstName,String lastName){
        String surname = lastName;
        String name = firstName;

        System.out.println("Dear " + name + " " + surname);
    }
}
