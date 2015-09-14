
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int number = input.nextInt();
        String asterixOutput = "";
        if (number > 0 && number < 11) {
            for (int x = 0; x < number; x++) {
                asterixOutput += "*";
            }
            for (int x = 0; x < number; x++) {
                System.out.println(asterixOutput);
            }

        } else {
            System.out.println("wrong , pls stop");
        }
    }
}
