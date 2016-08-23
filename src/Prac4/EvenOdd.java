package Prac4;

import java.util.Scanner;

/**
 * Created by jc259420 on 23/08/2016.
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer >> ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
