package Prac6;

/**
 * Created by jc259420 on 20/10/2016.
 */
public class Candle {

    protected String colour;
    protected int height;
    protected double price;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHeight(int height) {
        this.height = height;
        price = 2 * height;
    }

    public String getColour() {
        return colour;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }
}
