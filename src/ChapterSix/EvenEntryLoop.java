package ChapterSix;

import java.util.Scanner;

/**
 * Created by jc259420 on 23/08/2016.
 */
public class EvenEntryLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an even number >> ");
        int num = input.nextInt();
        System.out.println();
        while (num != 999){
            if (num % 2 == 0){
                System.out.println("Good Job!");
            }else{
                System.out.println("Error Try again.");
            }
            System.out.print("Enter an even number >> ");
            num = input.nextInt();
        }
    }
}
