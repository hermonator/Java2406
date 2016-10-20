package Prac6;

/**
 * Created by jc259420 on 20/10/2016.
 */
public class Horse {
    protected String name;
    protected String colour;
    protected String birthYear;


    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }
}
