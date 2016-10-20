package Prac5;

import java.util.Scanner;

/**
 * Created by jc259420 on 6/09/2016.
 */
public class BabyNameComparison {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    String[] babyfirstnames = new String[3];

    for(int i = 0; i < 3 ; ++i){
        String name = input.nextLine();
        babyfirstnames[i] = name;

    }
        for(int y = 0; y < 3; ++y){
            for(int z = 0; z < 3; ++z){
                if (babyfirstnames[y] != babyfirstnames[z]){
                    System.out.println(babyfirstnames[y] + babyfirstnames[z]);
                }
            }
        }
    }
}
