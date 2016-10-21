package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public abstract class Book {

    protected String name;
    protected double price;

    public Book(String name){this.name = name;}

    protected abstract void setPrice(double price);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
