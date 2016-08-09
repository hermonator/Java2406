package ChapterThree;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class ShowStudent {
    public static void main(String[] args) {
        Student bob = new Student();
        bob.setIdNumber(12828828);
        bob.setNumberOfCreditHoursEarned(50);
        bob.setNumberOfPointsEarned(100);

        bob.updateGpa();

        System.out.println(bob.getIdNumber());
        System.out.println(bob.getNumberOfCrediHoursEarned());
        System.out.println(bob.getNumberOfPointsEarned());
        System.out.println(bob.getGpa());
    }

}
