
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simma1980
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter integer between 50 and 100 plz: ");
        int next = in.nextInt(); //asks for a number
        while (next < 50 || next > 100) {
            System.out.print("You're an idiot, try again: ");
            next = in.nextInt(); //reasks if number doesn't meet guidelines
        }
        for (int i = 100; i >= next; i = i - 5) {
            System.out.println(i); //outputs i which decreases by five each loop, stops if i less than number
            try { //delays computer to emphasize the countdown
                Thread.sleep(1000);
            } catch (Exception e) {        
            };
        }
    }
}
