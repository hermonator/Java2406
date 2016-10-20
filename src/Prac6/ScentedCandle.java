package Prac6;

/**
 * Created by jc259420 on 20/10/2016.
 */
public class ScentedCandle extends Candle {


    protected String scent;


    public void setScent(String scent) {
        this.scent = scent;
    }

    public String getScent() {
        return scent;
    }

    @Override
    public void setHeight(int height) {

        this.height = height;
        price = 3 * height;
    }
}
