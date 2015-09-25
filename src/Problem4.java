
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simma1980
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter integer between 1 and 10 plz: ");
        int next = in.nextInt(); //asks user for number
        while (next > 10 || next < 1) {
            System.out.print("Try again plz: ");
            next = in.nextInt(); //reasks if number doesn't meet guidelines
        }
        for (;next > 0;next--) {
            System.out.print("*"); //outputs number of asterisks to match number
        }
        System.out.print("\n"); //leaves BUILD SUCCESSFUL on next line
    }
}
