package Prac6;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class Poem {

    protected String name;
    protected int numberOfLines;


    public Poem(String name, int numberOfLines){
        this.name = name;
        this.numberOfLines = numberOfLines;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }
}
