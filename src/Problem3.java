
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the cost of the food.");
        int food = input.nextInt();
        System.out.println("Please enter the cost of the DJ.");
        int DJ = input.nextInt();
        System.out.println("Please enter the cost of the hall rental.");
        int hall = input.nextInt();
        System.out.println("Please enter the cost of the wait staff.");
        int staff = input.nextInt();
        System.out.println("Please enter the cost of the decorations.");
        int decorations = input.nextInt();
        System.out.println("Please enter any miscellaneous expenses.");
        int misc = input.nextInt();
        
        int total = food + DJ + hall + staff + decorations + misc;
        
        System.out.println("The total cost is " + total);
        
        int ticket = 35;
        
        int sell = total/ticket;
        
        System.out.println("You will need to sell " + sell + " tickets to break even.");
    }
}
