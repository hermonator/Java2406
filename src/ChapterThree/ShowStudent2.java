package ChapterThree;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class ShowStudent2 {
    public static void main(String[] args) {
        Student elise = new Student();
        elise.updateGpa();
        System.out.println(elise.getGpa());
        System.out.println(elise.getIdNumber());
        System.out.println(elise.getNumberOfCrediHoursEarned());
        System.out.println(elise.getNumberOfPointsEarned());
    }
}
