package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class NonFiction extends Book {
    public NonFiction(String name){
        super(name);
        setPrice(37.99);


    }
    @Override
    protected void setPrice(double price) {
        this.price = price;
    }
}
