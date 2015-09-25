
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simma1980
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter food cost plz: "); 
        double food = in.nextDouble(); //asks food cost
        System.out.print("Enter DJ cost plz: ");
        double dj = in.nextDouble(); //asks DJ cost
        System.out.print("Enter rental hall cost plz: ");
        double hall = in.nextDouble(); //asks hall cost
        System.out.print("Enter decorations cost plz: ");
        double deco = in.nextDouble(); //asks decorations cost
        System.out.print("Enter Wait Staff cost plz: ");
        double wait = in.nextDouble(); //asks wait staff cost
        System.out.print("Enter miscellaneous cost plz: ");
        double misc = in.nextDouble(); //asks miscellaneous cost
        double total = food + dj + hall + deco + wait + misc; //finds total cost
        //divides total cost by ticket cost ($35) to find ticket sales to break even
        System.out.println((int)(Math.ceil(total/35)) + " tickets must be sold to break even."); 
    }
}