package ChapterThree;

/**
 * Created by Jesse Hermon on 19/08/2016.
 */
public class TwoCharacters {
    public static void main(String[] args) {
        // Creating the characters
        // Displaying the characters
        MyCharacter firstChar = new MyCharacter();
        firstChar.setSpecialty("Ranger");
        firstChar.setAttack(54.9);
        firstChar.setDefense(12);


        MyCharacter secondChar = new MyCharacter();
        secondChar.setAttack(34);
        secondChar.setDefense(37);
        secondChar.setSpecialty("Warrior");

        firstChar.displayCharacters();
        secondChar.displayCharacters();



    }
}
