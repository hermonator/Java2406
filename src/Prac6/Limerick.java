package Prac6;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class Limerick extends Poem {

    private String title;

    public Limerick(String name, String title){
        super(name, 5);
        this.title = title;


    }

    public String getTitle() {
        return title;
    }
}
