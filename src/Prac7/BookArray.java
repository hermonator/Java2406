package Prac7;

import java.util.Scanner;

/**
 * Created by jc259420 on 21/10/2016.
 */
public class BookArray {
    static Book[] library = new Book[10];
    public static void main(String[] args) {

        creatingLibrary();
        viewingLibrary();
    }

    public static void creatingLibrary(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < library.length ; i++){
            System.out.print("Enter Book type (f/nf): ");
            if (input.nextLine().equals("f")){
                 library[i] = new Fiction("book " + Integer.toString(i));

            }else{
                library[i] = new NonFiction("book " + Integer.toString(i));
            }

        }
    }

    public  static void viewingLibrary(){
        for(int j = 0; j < library.length ; j++){
            System.out.println(library[j].getName() + " costs: $" + library[j].getPrice());
        }
    }
}
