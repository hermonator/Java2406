package ChapterThree;

/**
 * Created by Jesse Hermon on 19/08/2016.
 */
public class MyCharacter {
    private String specialty;
    private double attack;
    private double defense;

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public double getAttack() {
        return attack;
    }

    public double getDefense() {
        return defense;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void displayCharacters(){
        System.out.print("Speciality: " + this.specialty + "\n");
        System.out.print("Attack: " + this.attack + "\n");
        System.out.print("Defense: " + this.defense + "\n");
    }
}
