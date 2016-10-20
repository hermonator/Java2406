package Prac6;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class Haiku extends Poem {

    private String title;

    public Haiku(String name, String title){
        //numberOfLines = 3;
        super(name,3);
        this.title = title;

    }

    public String getTitle() {
        return title;
    }
}
