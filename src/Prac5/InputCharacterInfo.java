package Prac5;

import java.util.Scanner;

/**
 * Created by jc259420 on 6/09/2016.
 */
public class InputCharacterInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char aChar = input.next().charAt(0);

        System.out.println("The character is " + aChar);
        if(Character.isUpperCase(aChar)){
            System.out.println(aChar + " is uppercase");
        } else {
            System.out.println(aChar + " is not uppercase");

        }
        if(Character.isLowerCase(aChar)){
            System.out.println(aChar + " is lowercase");
        }else{
            System.out.println(aChar + " is not lowercase");

        }
        aChar = Character.toLowerCase(aChar);
        System.out.println("After toLowerCase(), aChar is " + aChar);
        aChar = Character.toUpperCase(aChar);
        System.out.println("After toUpperCase(), aChar is " + aChar);

        if(Character.isLetterOrDigit(aChar)){
            System.out.println(aChar + " is a letter or digit");
        }else{
            System.out.println(aChar + " is neither a letter nor a digit");
        }if(Character.isWhitespace(aChar)){
            System.out.println();
        }else{
            System.out.println(aChar + " is not whitespace");
        }
    }
}
