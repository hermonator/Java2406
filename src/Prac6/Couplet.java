package Prac6;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class Couplet extends Poem {

    private String title;

    public Couplet(String name, String title){
        super(name, 2);
        this.title = title;

    }

    public String getTitle() {
        return title;
    }
}
