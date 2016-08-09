package ChapterThree;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class Student {
    private int idNumber;
    private int numberOfCreditHoursEarned;
    private int numberOfPointsEarned;
    private double gpa;

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setNumberOfCreditHoursEarned(int numberOfCreditHoursEarned) {
        this.numberOfCreditHoursEarned = numberOfCreditHoursEarned;
    }

    public void setNumberOfPointsEarned(int numberOfPointsEarned) {
        this.numberOfPointsEarned = numberOfPointsEarned;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getNumberOfCrediHoursEarned() {
        return numberOfCreditHoursEarned;
    }

    public int getNumberOfPointsEarned() {
        return numberOfPointsEarned;
    }
}
