package Prac7;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class Fiction extends Book {

    public Fiction(String name){
        super(name);
        setPrice(24.99);
    }

    protected void setPrice(double price) {
        this.price = price;

    }
}
