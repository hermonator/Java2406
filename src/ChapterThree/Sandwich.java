package ChapterThree;

/**
 * Created by Jesse Hermon on 9/08/2016.
 */
public class Sandwich {

    // Data types
    private String mainIngredient;
    private String breadType;
    private double price;

    public void setMainIngredient(String ingredient){mainIngredient = ingredient;}
    public void setBreadType(String bread){breadType = bread;}
    public void setPrice(double cost){price = cost;}
    public String getMainIngredient(){return mainIngredient;}
    public String getBreadType(){return breadType;}
    public double getPrice(){return price;}
}
