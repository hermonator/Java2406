import javax.swing.*;

/**
 * Created by Jesse Hermon on 1/08/2016.
 */
public class ChOneGZRandomGuess {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Think of a number beteen 1 and 10");
        JOptionPane.showMessageDialog(null,"The number is " + (1 + (int)(Math.random() * 10)));
    }
}
