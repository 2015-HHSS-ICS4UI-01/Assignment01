
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thomt9963
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100 to stop at.");
        int stop = input.nextInt();
        int countdown = 100;
        for (int count = 5; countdown >= stop; countdown = countdown - count)
        {
            System.out.println(countdown);
        }
    }
}
