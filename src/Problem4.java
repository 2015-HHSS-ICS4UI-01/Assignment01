
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        String asterixOutput = "";
        int number = input.nextInt();
        if (number > 0 && number < 11) {
            for (int x = 0; x < number; x++) {
                asterixOutput += "*";
            }
            System.out.println(asterixOutput);
        } else {
            System.out.println("The number you have entered is not between 1 and 10.");
        }

    }
}
