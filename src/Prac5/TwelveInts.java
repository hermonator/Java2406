package Prac5;

/**
 * Created by jc259420 on 6/09/2016.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12};

        for (int x = 0; x < numbers.length; ++x){
            System.out.println(numbers[x]);
        }

        for (int y = (numbers.length - 1); y > -1; --y){
            System.out.println(numbers[y]);
        }



    }
}
