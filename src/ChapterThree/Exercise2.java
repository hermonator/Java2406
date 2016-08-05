package ChapterThree;

/**
 * Created by Jesse Hermon on 5/08/2016.
 */
public class Exercise2 {
    /*
    a
    b
    c
    f
    h
    j

     */
    public static void main(String[] args) {


        int age = 34;
        int weight = 180;
        double height = 5.9;

        calculate(age,weight);
        calculate(age, height);
        calculate(weight, height);
        calculate(weight, weight);



    }

    public static void calculate(int age, double size)
    {
        System.out.println("whoa");
    }
}
