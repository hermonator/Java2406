package ChapterFive;

import java.util.Scanner;

/**
 * Created by jc259420 on 23/08/2016.
 */
public class AscendingAndDecending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.print("Enter a int >> ");
        numbers[0] = input.nextInt();
        System.out.print("Enter a int >> ");
        numbers[1] = input.nextInt();
        System.out.print("Enter a int >> ");
        numbers[2] =input.nextInt();

        int largest = 0;
        int large = 0;
        int smallest =0;

        for(int i = 0;i < 3;++i){
            if (numbers[i] > largest){
                smallest = large;
                large = largest;
                largest = numbers[i];

            }else if (numbers[i] > large){
                smallest = large;
                large = numbers[i];
            }else{
                smallest = numbers[i];
            }


        }
        System.out.println(largest + " " + large + " " + smallest);


    }
}
